# For gstreamer1.0-plugins-good v1.12.0, the subpackage gstreamer1.0-plugins-good-souphttpsrc
# has been renamed as gstreamer1.0-plugins-good-soup

RDEPENDS:${PN}-network-base:remove = " gstreamer1.0-plugins-good-souphttpsrc"

RDEPENDS:${PN}-network-base += " gstreamer1.0-plugins-good-soup"

RDEPENDS:${PN} += " gstreamer1.0-rtsp-server"
