# Disable GST0.10 components for i.MX6/7

RDEPENDS_${PN}_remove_mx6 = " gst-meta-audio gst-meta-video"
RDEPENDS_${PN}_remove_mx6ul = " gst-meta-audio gst-meta-video"
RDEPENDS_${PN}_remove_mx7 = " gst-meta-audio gst-meta-video"
