

matchbox-base = "${@bb.utils.contains('DISTRO_FEATURES', 'x11 wayland', ' \
                                         matchbox-desktop matchbox-session-sato  matchbox-keyboard matchbox-keyboard-applet matchbox-keyboard-im matchbox-config-gtk', '', d)}"
matchbox-apps = "${@bb.utils.contains('DISTRO_FEATURES', 'x11 wayland', 'matchbox-terminal', '', d)}"

RDEPENDS:${PN}-base:remove = "${matchbox-base}"
RDEPENDS:${PN}-apps:remove = "${matchbox-apps} \
                              gst-player-bin \
"
