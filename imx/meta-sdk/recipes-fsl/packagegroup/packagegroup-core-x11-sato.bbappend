

matchbox-base = "${@base_contains('DISTRO_FEATURES', 'wayland', \
                                      base_contains('DISTRO_FEATURES', 'x11',' \
                                         matchbox-desktop matchbox-session-sato  matchbox-keyboard matchbox-keyboard-applet matchbox-keyboard-im matchbox-config-gtk', '', d), '',d)}"
matchbox-apps = "${@base_contains('DISTRO_FEATURES', 'wayland', \
                                      base_contains('DISTRO_FEATURES', 'x11','matchbox-terminal', '', d), '',d)}"

RDEPENDS_${PN}-base_remove = "${matchbox-base}"
RDEPENDS_${PN}-apps_remove = "${matchbox-apps}"
