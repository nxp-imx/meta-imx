# Add needed Freescale packages and definitions

RDEPENDS_${PN} += " \
    ${PN}-streamer \
"

RDEPENDS_${PN}-audio += " \
    gst-plugins-good-audioparsers \
"
