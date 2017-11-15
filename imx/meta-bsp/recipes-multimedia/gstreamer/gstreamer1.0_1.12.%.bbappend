# Use i.MX fork of GST for customizations
GST1.0_SRC ?= "gitsm://source.codeaurora.org/external/imx/gstreamer.git;protocol=https"
SRCBRANCH = "imx-1.12.x"

SRC_URI_remove_imx = "http://gstreamer.freedesktop.org/src/gstreamer/gstreamer-${PV}.tar.xz "
SRC_URI_append_imx = " ${GST1.0_SRC};branch=${SRCBRANCH}"
SRCREV_imx = "cca1ebf223bd423ed5fc21031014ee1f3ce497a1"

EXTRA_AUTORECONF = ""

DEPENDS += " elfutils"

# Unrecognised options, need to remove them
EXTRA_OECONF_remove = " --disable-docbook --disable-trace"

S_imx = "${WORKDIR}/git"
