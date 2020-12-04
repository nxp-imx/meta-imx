require libdrm_2.4.99.imx.bb

FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

LIC_FILES_CHKSUM = "file://xf86drm.c;beginline=9;endline=32;md5=c8a3b961af7667c530816761e949dc71"
IMX_LIBDRM_BRANCH = "libdrm-imx-2.4.102"
SRCREV = "f525ae649cd6e81e5d4e459799b0f7a120c4e174"

SRC_URI_remove = "file://musl-ioctl.patch"
