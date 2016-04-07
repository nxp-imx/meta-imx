# basic plugins required in virtually every pipeline
RDEPENDS_${PN}-base += " \
    ${@bb.utils.contains("MACHINE_GSTREAMER_1_0_PLUGIN", "imx-gst1.0-plugin", "imx-gst1.0-plugin-gplay", "", d)} \
    ${@bb.utils.contains("MACHINE_GSTREAMER_1_0_PLUGIN", "imx-gst1.0-plugin", "imx-gst1.0-plugin-grecorder", "", d)} \
"
