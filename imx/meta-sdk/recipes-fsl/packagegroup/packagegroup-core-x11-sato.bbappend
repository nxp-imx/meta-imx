

matchbox-base = "${@base_contains('DISTRO_FEATURES', 'x11', \
                                      base_contains('DISTRO_FEATURES', 'wayland',' \
                                         matchbox-desktop matchbox-session-sato  matchbox-keyboard matchbox-keyboard-applet matchbox-keyboard-im matchbox-config-gtk', '', d), '',d)}"
matchbox-apps = "${@base_contains('DISTRO_FEATURES', 'x11', \
                                      base_contains('DISTRO_FEATURES', 'wayland','matchbox-terminal', '', d), '',d)}"

RDEPENDS_${PN}-base_remove = "${matchbox-base}"
RDEPENDS_${PN}-apps_remove = "${matchbox-apps}"
