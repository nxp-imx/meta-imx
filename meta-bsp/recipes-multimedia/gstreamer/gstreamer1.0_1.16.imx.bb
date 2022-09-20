require recipes-multimedia/gstreamer/gstreamer1.0_1.16.0.bb

PV = "1.16.0.imx"

FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/files:"

# Use i.MX fork of GST for customizations
GST1.0_SRC ?= "gitsm://github.com/nxp-imx/gstreamer.git;protocol=https"
SRCBRANCH = "MM_04.05.04_2002_L5.4.3"
SRCREV = "a4c220605ac0923596b89f4f07c05d235bc09259" 
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
