# Copyright (C) 2013 Eric Bénard - Eukréa Electromatique

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://0001-evdevtouch-Avoid-crashing-on-exit.patch \
"

HAS_X11 = "${@bb.utils.contains('DISTRO_FEATURES', 'x11', 1, 0, d)}"

IS_IMX3D = "0"
IS_IMX3D_imxgpu3d = "3d"
IS_IMX3D_imxgpu2d = "2d"

PACKAGECONFIG_GL_imxgpu3d = "gles2"
PACKAGECONFIG_GL_imxgpu2d = "${@bb.utils.contains('DISTRO_FEATURES', 'x11', ' gl', '', d)}"
PACKAGECONFIG_GL_imxpxp = "gles2"
PACKAGECONFIG_GL_mx8 = "gles2"
QT_CONFIG_FLAGS_APPEND = ""
QT_CONFIG_FLAGS_APPEND_imxgpu3d = "${@bb.utils.contains('DISTRO_FEATURES', 'x11', ' -no-eglfs', ' -eglfs', d)}"
QT_CONFIG_FLAGS_APPEND_imxgpu2d = "${@bb.utils.contains('DISTRO_FEATURES', 'x11', ' -no-eglfs', \
                                                 ' -no-opengl -linuxfb -no-eglfs -no-widgets', d)}"
QT_CONFIG_FLAGS_APPEND_imxpxp = "${@bb.utils.contains('DISTRO_FEATURES', 'x11', ' -no-eglfs', ' -eglfs', d)}"
QT_CONFIG_FLAGS_APPEND_mx8 = "${@bb.utils.contains('DISTRO_FEATURES', 'x11', ' -no-eglfs', ' -eglfs', d)}"
QT_CONFIG_FLAGS_append = "${QT_CONFIG_FLAGS_APPEND}"

do_configure_prepend() {
    # adapt qmake.conf to our needs
    sed -i 's!load(qt_config)!!' ${S}/mkspecs/linux-oe-g++/qmake.conf
    if test ${HAS_X11} -eq 0; then
        if test ${IS_IMX3D} -eq "2d"; then
    
            cat >> ${S}/mkspecs/linux-oe-g++/qmake.conf <<EOF
IMX_CFLAGS             = -DLINUX=1 -DEGL_API_FB=1
EGLFS_DEVICE_INTEGRATION = eglfs_viv
EOF
        else
            cat >> ${S}/mkspecs/linux-oe-g++/qmake.conf <<EOF
IMX_CFLAGS             = -DLINUX=1
EOF
        fi
    else
        cat >> ${S}/mkspecs/linux-oe-g++/qmake.conf <<EOF
IMX_CFLAGS             = -DLINUX=1
EOF
    fi
    cat >> ${S}/mkspecs/linux-oe-g++/qmake.conf <<EOF
QMAKE_LIBS_EGL         += -lEGL
QMAKE_LIBS_OPENGL_ES2  += -lGLESv2 -lEGL
QMAKE_LIBS_OPENVG      += -lOpenVG -lEGL
QMAKE_CFLAGS_RELEASE   += \$\$IMX_CFLAGS
QMAKE_CXXFLAGS_RELEASE += \$\$IMX_CFLAGS
QMAKE_CFLAGS_DEBUG   += \$\$IMX_CFLAGS
QMAKE_CXXFLAGS_DEBUG += \$\$IMX_CFLAGS

load(qt_config)

EOF
}

PACKAGECONFIG_append = " accessibility examples"
