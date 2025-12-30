RDEPENDS:${PN} += " gstreamer1.0-rtsp-server"
RDEPENDS:${PN}-base:remove = " \
    gstreamer1.0-plugins-base-videoconvert \
    gstreamer1.0-plugins-base-videoscale \
    ${@bb.utils.contains("MACHINE_GSTREAMER_1_0_PLUGIN", "imx-gst1.0-plugin", "imx-gst1.0-plugin-gplay", "", d)} \
    ${@bb.utils.contains("MACHINE_GSTREAMER_1_0_PLUGIN", "imx-gst1.0-plugin", "imx-gst1.0-plugin-grecorder", "", d)} \
"
RDEPENDS:${PN}-base:append = " \
    gstreamer1.0-plugins-base-videoconvertscale \
    ${@bb.utils.contains("MACHINE_GSTREAMER_1_0_PLUGIN", "imx-gst1.0-plugin", "imx-gst1.0-plugin-tools", "", d)} \
"
