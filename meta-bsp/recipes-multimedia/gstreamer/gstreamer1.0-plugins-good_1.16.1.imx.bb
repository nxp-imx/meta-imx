require recipes-multimedia/gstreamer/gstreamer1.0-plugins-good_1.16.1.bb

FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/${PN}:"
FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/files:"

GST1.0-PLUGINS-GOOD_SRC ?= "gitsm://source.codeaurora.org/external/imx/gst-plugins-good.git;protocol=https"
SRCBRANCH = "imx-1.16.x"
SRCREV = "8bce5bcb203d5e2813ded1bde5fb8470edd97230"

SRC_URI = " \
    ${GST1.0-PLUGINS-GOOD_SRC};branch=${SRCBRANCH} \
    file://0001-introspection.m4-prefix-pkgconfig-paths-with-PKG_CON.patch \
"

S = "${WORKDIR}/git"

DEPENDS_append = " libdrm"
# This remove "--exclude=autopoint" option from autoreconf argument to avoid
# configure.ac:30: error: required file './ABOUT-NLS' not found
EXTRA_AUTORECONF = ""

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"
