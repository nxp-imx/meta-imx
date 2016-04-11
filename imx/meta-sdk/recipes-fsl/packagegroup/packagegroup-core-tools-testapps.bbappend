# Disable GST0.10 components for i.MX6/7

RDEPENDS_${PN}_remove_mx6 = " gst-meta-audio gst-meta-video"
RDEPENDS_${PN}_remove_mx7 = " gst-meta-audio gst-meta-video"

# gst-player has been integrated into gstreamer1.0-plugin-bad-v1.8.0 with version 1.0,
# need to remove the old one
RDEPENDS_${PN}_remove = " ${@bb.utils.contains('DISTRO_FEATURES', 'x11', "gst-player-bin", "", d)} \
                          ${@bb.utils.contains('DISTRO_FEATURES', 'x11 opengl', "gst-player-bin", "", d)} \
"

