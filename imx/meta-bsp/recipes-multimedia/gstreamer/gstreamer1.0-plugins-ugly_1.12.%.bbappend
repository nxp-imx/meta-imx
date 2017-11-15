# Use i.MX fork of GST for customizations
SRC_URI_remove_imx = " \
    http://gstreamer.freedesktop.org/src/gst-plugins-ugly/gst-plugins-ugly-${PV}.tar.xz \
"

GST1.0-PLUGINS-UGLY_SRC ?= "gitsm://source.codeaurora.org/external/imx/gst-plugins-ugly.git;protocol=https"
SRCBRANCH = "1.12"

SRC_URI_append_imx = " ${GST1.0-PLUGINS-UGLY_SRC};branch=${SRCBRANCH} "
SRCREV_imx = "0eb35ac0d4464ad1685adc1f54f9e645fd74955d"

EXTRA_AUTORECONF = ""

S_imx = "${WORKDIR}/git"
