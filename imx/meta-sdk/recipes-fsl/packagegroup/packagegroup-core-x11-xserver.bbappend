
XWAYLAND = "${@bb.utils.contains('DISTRO_FEATURES', 'x11 wayland', \
               'xf86-video-fbdev xf86-video-imxfb-vivante xf86-input-evdev', '', d)}"

RDEPENDS_${PN}_remove = "\
    ${XWAYLAND} \
    "
