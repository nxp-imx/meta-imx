do_install_append() {
    rm ${D}${sysconfdir}/xdg/weston/weston.ini
}

FILES_${PN}_remove = "${sysconfdir}/xdg/weston/weston.ini"
CONFFILES_${PN}_remove = "${sysconfdir}/xdg/weston/weston.ini"
