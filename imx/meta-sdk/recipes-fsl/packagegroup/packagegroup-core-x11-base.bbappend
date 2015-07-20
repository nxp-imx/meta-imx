matchbox-apps = "${@base_contains('DISTRO_FEATURES', 'wayland', \
                                      base_contains('DISTRO_FEATURES', 'x11','matchbox-terminal matchbox-wm', '', d), '',d)}"

RDEPENDS_${PN}_remove = "${matchbox-apps}"