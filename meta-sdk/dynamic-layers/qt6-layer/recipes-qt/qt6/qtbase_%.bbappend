FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += " \
    file://qt-${IMX_BACKEND}.sh \
    file://qtbase-fix-no-opengl-build.patch \
"

PACKAGECONFIG_GRAPHICS:imxpxp = ""

PACKAGECONFIG_PLATFORM = "no-opengl linuxfb"

IMX_BACKEND = \
    "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland', \
        bb.utils.contains('DISTRO_FEATURES',     'x11', 'x11', \
                                                        '${IMX_BACKEND_FB}', d), d)}"
IMX_BACKEND_FB          = "linuxfb"
IMX_BACKEND_FB:imxgpu3d = "eglfs"

do_install:append () {
    install -d ${D}${sysconfdir}/profile.d/
    install -m 0755 ${WORKDIR}/qt-${IMX_BACKEND}.sh ${D}${sysconfdir}/profile.d/qt.sh
}
