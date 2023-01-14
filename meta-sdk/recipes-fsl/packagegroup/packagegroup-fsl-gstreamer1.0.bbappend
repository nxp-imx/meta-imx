RDEPENDS:${PN} += " gstreamer1.0-rtsp-server"

RDEPENDS:${PN}-network-base:remove = "${RDEPENDS_REMOVE_SOUP}"
RDEPENDS_REMOVE_SOUP ?= "${@bb.utils.contains('DISTRO_FEATURES', 'x11', '', 'gstreamer1.0-plugins-good-soup', d)}"
