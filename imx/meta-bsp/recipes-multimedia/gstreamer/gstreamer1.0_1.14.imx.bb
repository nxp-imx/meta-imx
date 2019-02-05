require recipes-multimedia/gstreamer/gstreamer1.0.inc

# Re-use patch files from 1.12.2 recipe
FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/files:"

LIC_FILES_CHKSUM = "file://COPYING;md5=6762ed442b3822387a51c92d928ead0d \
                    file://gst/gst.h;beginline=1;endline=21;md5=e059138481205ee2c6fc1c079c016d0d"

# Use i.MX fork of GST for customizations
GST1.0_SRC ?= "gitsm://source.codeaurora.org/external/imx/gstreamer.git;protocol=https"
SRCBRANCH = "MM_04.04.04_1902_L4.14.92_GA"

SRC_URI = " ${GST1.0_SRC};branch=${SRCBRANCH}"
SRCREV = "d42548da09724ad8cc1aa4f1944607920be2f4c0" 

EXTRA_AUTORECONF = ""

DEPENDS += " elfutils"

# Unrecognised options, need to remove them
EXTRA_OECONF_remove = " --disable-docbook --disable-trace"

PV = "1.14.4.imx"

S = "${WORKDIR}/git"

