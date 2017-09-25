PACKAGECONFIG_append = " accessibility examples"
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

BACKEND = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland',\
	   bb.utils.contains('DISTRO_FEATURES', 'x11', 'x11', 'fb', d), d)}"
SRC_URI_append = " file://qt5-${BACKEND}.sh \
                   file://0001-xcb-Ignore-XI2-LMB-mouse-events-from-touch-screens.patch \
"

SRC_URI_append_imxgpu2d = " file://0001-egl.prf-Fix-build-error-when-egl-headers-need-platfo.patch"


do_install_append () {
    install -d ${D}${sysconfdir}/profile.d/
    install -m 0755 ${WORKDIR}/qt5-${BACKEND}.sh ${D}${sysconfdir}/profile.d/qt5.sh
}

QT_CONFIG_FLAGS_APPEND = ""
QT_CONFIG_FLAGS_APPEND_imxpxp = "${@bb.utils.contains('DISTRO_FEATURES', 'x11', '-no-eglfs', \
                       bb.utils.contains('DISTRO_FEATURES', 'wayland', '-no-eglfs', '-eglfs', d), d)}"
QT_CONFIG_FLAGS_APPEND_imxgpu2d = "${@bb.utils.contains('DISTRO_FEATURES', 'x11', '-no-eglfs', '-no-opengl -linuxfb -no-eglfs', d)}"
QT_CONFIG_FLAGS_APPEND_imxgpu3d = "${@bb.utils.contains('DISTRO_FEATURES', 'x11', '-no-eglfs', \
                       bb.utils.contains('DISTRO_FEATURES', 'wayland', '-no-eglfs', '-eglfs', d), d)}"

FILES_${PN} += "${sysconfdir}/profile.d/qt5.sh"
