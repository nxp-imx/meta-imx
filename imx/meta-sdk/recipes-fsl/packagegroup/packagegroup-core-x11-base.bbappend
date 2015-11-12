
# Remove matchbox for xwayland
matchbox = "${@bb.utils.contains('DISTRO_FEATURES', 'x11 wayland', 'matchbox-terminal matchbox-wm', '', d)}"

RDEPENDS_${PN}_remove = "${matchbox}"
