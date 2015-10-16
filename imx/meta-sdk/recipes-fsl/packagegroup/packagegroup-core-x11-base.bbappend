
# Remove matchbox for xwayland
matchbox = "${@base_contains('DISTRO_FEATURES', 'x11', \
                                      base_contains('DISTRO_FEATURES', 'wayland','matchbox-terminal matchbox-wm', '', d), '',d)}"

RDEPENDS_${PN}_remove = "${matchbox}"
