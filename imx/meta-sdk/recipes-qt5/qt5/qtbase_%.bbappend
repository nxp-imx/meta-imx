PACKAGECONFIG_append = " accessibility examples"
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

BACKEND = "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland',\
	   bb.utils.contains('DISTRO_FEATURES', 'x11', 'x11', 'fb', d), d)}"
SRC_URI_append = " file://qt5-${BACKEND}.sh"

do_install_append () {
    install -d ${D}${sysconfdir}/profile.d/
    install -m 0755 ${WORKDIR}/qt5-${BACKEND}.sh ${D}${sysconfdir}/profile.d/qt5.sh
}

FILES_${PN} += "${sysconfdir}/profile.d/qt5.sh"
