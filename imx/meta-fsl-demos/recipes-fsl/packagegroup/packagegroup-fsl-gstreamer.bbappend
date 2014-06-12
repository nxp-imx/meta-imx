# Add needed Freescale packages and definitions

RDEPENDS_${PN} += " \
    ${PN}-streamer \
    gst-plugins-base-meta \
    gst-plugins-good-meta \
"

RDEPENDS_${PN}_mx6 = " \
    gst-plugins-base-tcp \
"

RDEPENDS_${PN}-audio += " \
    gst-plugins-good-audioparsers \
"
