# FIXME: Here it can avoid xinput_calibrator run under background
#        when Desktop shows
do_install_append() {
     # Remove the xinput_calibrator.desktop from xdg/autostart
     rm -rf ${D}${sysconfdir}/xdg/autostart
}

