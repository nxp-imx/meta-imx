# gst-player has been integrated into gstreamer1.0-plugin-bad-v1.8.0 with version 1.0,
# need to remove the old one
RDEPENDS:${PN}:remove = " ${@bb.utils.contains('DISTRO_FEATURES', 'x11', "gst-player-bin", "", d)} \
                          ${@bb.utils.contains('DISTRO_FEATURES', 'x11 opengl', "gst-player-bin", "", d)} \
"

IMX_CORE_TOOLS = ""
IMX_CORE_TOOLS:imxgpu2d = " tslib"
IMX_CORE_TOOLS:imxpxp = " tslib"

RDEPENDS:${PN} += " \
    ${IMX_CORE_TOOLS} \
    libgpiod-tools \
    pipewire \
    pipewire-spa-tools \
    pipewire-tools \
    pipewire-v4l2 \
    pipewire-pulse \
"
