RDEPENDS:${PN} += " gstreamer1.0-rtsp-server"
RDEPENDS:${PN}-base:remove = " \
    gstreamer1.0-plugins-base-videoconvert \
    gstreamer1.0-plugins-base-videoscale \
"
RDEPENDS:${PN}-base:append = " \
    gstreamer1.0-plugins-base-videoconvertscale \
"
