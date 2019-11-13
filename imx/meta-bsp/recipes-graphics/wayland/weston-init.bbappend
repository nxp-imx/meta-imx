FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://profile"

do_install_append() {
    rm ${D}${sysconfdir}/xdg/weston/weston.ini
    install -Dm0755 ${WORKDIR}/profile ${D}${sysconfdir}/profile.d/weston.sh
}

FILES_${PN}_remove = "${sysconfdir}/xdg/weston/weston.ini"
CONFFILES_${PN}_remove = "${sysconfdir}/xdg/weston/weston.ini"
