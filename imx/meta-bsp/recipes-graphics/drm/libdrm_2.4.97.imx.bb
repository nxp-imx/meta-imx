require recipes-graphics/drm/libdrm_2.4.91.imx.bb

FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/meta-freescale/recipes-graphics/drm/${BPN}:"

LIC_FILES_CHKSUM = "file://xf86drm.c;beginline=9;endline=32;md5=c8a3b961af7667c530816761e949dc71"
IMX_LIBDRM_BRANCH = "libdrm-imx-2.4.97"
SRC_URI_remove = "file://installtests.patch"
SRCREV = "cd1754eb0a0b0953ef42c0405900a4ac277dc6ac" 
