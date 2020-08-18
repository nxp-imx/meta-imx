require recipes-multimedia/gstreamer/gstreamer1.0_1.16.2.bb

FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/files:"

# Use i.MX fork of GST for customizations
GST1.0_SRC ?= "gitsm://source.codeaurora.org/external/imx/gstreamer.git;protocol=https"
SRCBRANCH = "MM_04.05.06_2008_L5.4.47"
SRCREV = "8514bc61ccab208a65e387eab9347276a8e770e7"
SRC_URI = " \
    ${GST1.0_SRC};branch=${SRCBRANCH} \
    file://0001-introspection.m4-prefix-pkgconfig-paths-with-PKG_CON.patch \
    file://gtk-doc-tweaks.patch \
    file://0001-gst-gstpluginloader.c-when-env-var-is-set-do-not-fal.patch \
    file://add-a-target-to-compile-tests.patch \
    file://run-ptest \
"

S = "${WORKDIR}/git"

# This remove "--exclude=autopoint" option from autoreconf argument to avoid
# configure.ac:30: error: required file './ABOUT-NLS' not found
EXTRA_AUTORECONF = ""

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"
