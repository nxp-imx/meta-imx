# Add needed Freescale packages and definitions

# Add it into tools & Test applications group
RDEPENDS_${PN}-tools-testapps += "\
    imx-kobs \
    canutils \
"

RDEPENDS_${PN}-gstreamer += " \
    gst-meta-debug \
"

