# Use i.MX fork of GST for customizations
SRC_URI_remove_imx = " \
    http://gstreamer.freedesktop.org/src/gst-libav/gst-libav-${PV}.tar.xz \
    file://0002-gstavcodecmap-Do-not-require-a-channel-mask.patch \
"
GST1.0-LIBAV_SRC ?= "gitsm://source.codeaurora.org/external/imx/gst-libav.git;protocol=https"
SRCBRANCH = "imx-1.12.x"

SRC_URI_append_imx = " ${GST1.0-LIBAV_SRC};branch=${SRCBRANCH} "
SRCREV_imx = "7aa0c9e37183ec67e41e7780dbf223b381cc2788"

S_imx = "${WORKDIR}/git"
