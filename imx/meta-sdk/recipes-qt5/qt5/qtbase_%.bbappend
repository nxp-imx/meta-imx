# Copyright (C) 2013 Eric Bénard - Eukréa Electromatique

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://Force_egl_visual_ID_33.patch"

HAS_X11 = "${@base_contains('DISTRO_FEATURES', 'x11', 1, 0, d)}"

IS_MX6SL = "0"
IS_MX6SL_mx6sl = "1"

PACKAGECONFIG_GL_mx6q = "gles2"
PACKAGECONFIG_GL_mx6dl = "gles2"
PACKAGECONFIG_GL_mx6sx = "gles2"
PACKAGECONFIG_GL_mx6sl = "${@base_contains('DISTRO_FEATURES', 'x11', ' gl', '', d)}"
PACKAGECONFIG_GL_mx6ul = "gles2"
PACKAGECONFIG_GL_mx7 = "gles2"
QT_CONFIG_FLAGS_append_mx6q = "${@base_contains('DISTRO_FEATURES', 'x11', ' -no-eglfs', ' -eglfs', d)}"
QT_CONFIG_FLAGS_append_mx6dl = "${@base_contains('DISTRO_FEATURES', 'x11', ' -no-eglfs', ' -eglfs', d)}"
QT_CONFIG_FLAGS_append_mx6sx = "${@base_contains('DISTRO_FEATURES', 'x11', ' -no-eglfs', ' -eglfs', d)}"
QT_CONFIG_FLAGS_append_mx6sl = "${@base_contains('DISTRO_FEATURES', 'x11', ' -no-eglfs', \
                                                 ' -no-opengl -linuxfb -no-eglfs', d)}"
QT_CONFIG_FLAGS_append_mx6ul = "${@base_contains('DISTRO_FEATURES', 'x11', ' -no-eglfs', ' -eglfs', d)}"
QT_CONFIG_FLAGS_append_mx7 = "${@base_contains('DISTRO_FEATURES', 'x11', ' -no-eglfs', ' -eglfs', d)}"

do_configure_prepend() {
    # adapt qmake.conf to our needs
    sed -i 's!load(qt_config)!!' ${S}/mkspecs/linux-oe-g++/qmake.conf
    if test ${HAS_X11} -eq 0; then
        if test ${IS_MX6SL} -eq 0; then
    
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
