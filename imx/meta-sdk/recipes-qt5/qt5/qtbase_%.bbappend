# Copyright (C) 2013 Eric Bénard - Eukréa Electromatique

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://fix-eglfs_kms_egldevice-build-error.patch \
"

HAS_X11 = "${@bb.utils.contains('DISTRO_FEATURES', 'x11', 1, 0, d)}"

IS_NO_IMX3D = "0"
IS_NO_IMX3D_mx6sl = "1"
IS_NO_IMX3D_mx6ul = "1"
IS_NO_IMX3D_mx7 = "1"

PACKAGECONFIG_GL_mx6q = "gles2"
PACKAGECONFIG_GL_mx6dl = "gles2"
PACKAGECONFIG_GL_mx6sx = "gles2"
PACKAGECONFIG_GL_mx6sl = "${@bb.utils.contains('DISTRO_FEATURES', 'x11', ' gl', '', d)}"
PACKAGECONFIG_GL_mx6ul = "gles2"
PACKAGECONFIG_GL_mx7 = "gles2"
PACKAGECONFIG_GL_mx8 = "gles2"
QT_CONFIG_FLAGS_append_mx6q = "${@bb.utils.contains('DISTRO_FEATURES', 'x11', ' -no-eglfs', ' -eglfs', d)}"
QT_CONFIG_FLAGS_append_mx6dl = "${@bb.utils.contains('DISTRO_FEATURES', 'x11', ' -no-eglfs', ' -eglfs', d)}"
QT_CONFIG_FLAGS_append_mx6sx = "${@bb.utils.contains('DISTRO_FEATURES', 'x11', ' -no-eglfs', ' -eglfs', d)}"
QT_CONFIG_FLAGS_append_mx6sl = "${@bb.utils.contains('DISTRO_FEATURES', 'x11', ' -no-eglfs', \
                                                 ' -no-opengl -linuxfb -no-eglfs -no-widgets', d)}"
QT_CONFIG_FLAGS_append_mx6ul = "${@bb.utils.contains('DISTRO_FEATURES', 'x11', ' -no-eglfs', ' -eglfs', d)}"
QT_CONFIG_FLAGS_append_mx7 = "${@bb.utils.contains('DISTRO_FEATURES', 'x11', ' -no-eglfs', ' -eglfs', d)}"
QT_CONFIG_FLAGS_append_mx8 = "${@bb.utils.contains('DISTRO_FEATURES', 'x11', ' -no-eglfs', ' -eglfs', d)}"

do_configure_prepend() {
    # adapt qmake.conf to our needs
    sed -i 's!load(qt_config)!!' ${S}/mkspecs/linux-oe-g++/qmake.conf
    if test ${HAS_X11} -eq 0; then
        if test ${IS_NO_IMX3D} -eq 0; then
    
            cat >> ${S}/mkspecs/linux-oe-g++/qmake.conf <<EOF
IMX6_CFLAGS             = -DLINUX=1 -DEGL_API_FB=1
EGLFS_DEVICE_INTEGRATION = eglfs_viv
EOF
        else
            cat >> ${S}/mkspecs/linux-oe-g++/qmake.conf <<EOF
IMX6_CFLAGS             = -DLINUX=1
EOF
        fi
    else
        cat >> ${S}/mkspecs/linux-oe-g++/qmake.conf <<EOF
IMX6_CFLAGS             = -DLINUX=1
EOF
    fi
    cat >> ${S}/mkspecs/linux-oe-g++/qmake.conf <<EOF
QMAKE_LIBS_EGL         += -lEGL
QMAKE_LIBS_OPENGL_ES2  += -lGLESv2 -lEGL
QMAKE_LIBS_OPENVG      += -lOpenVG -lEGL
QMAKE_CFLAGS_RELEASE   += \$\$IMX6_CFLAGS
QMAKE_CXXFLAGS_RELEASE += \$\$IMX6_CFLAGS
QMAKE_CFLAGS_DEBUG   += \$\$IMX6_CFLAGS
QMAKE_CXXFLAGS_DEBUG += \$\$IMX6_CFLAGS

load(qt_config)

EOF
}

PACKAGECONFIG_append = " accessibility examples"
