
XWAYLAND = "${@base_contains('DISTRO_FEATURES', 'x11', \
             base_contains('DISTRO_FEATURES', 'wayland', \
               'xf86-video-fbdev xf86-video-imxfb-vivante xf86-input-evdev', '', d), '',d)}"

RDEPENDS_${PN}_remove = "\
    ${XWAYLAND} \
    "
