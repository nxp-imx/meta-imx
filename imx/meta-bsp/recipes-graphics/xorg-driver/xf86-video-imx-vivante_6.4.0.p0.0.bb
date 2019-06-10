FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/meta-freescale/recipes-graphics/xorg-driver/${BPN}:"

require recipes-graphics/xorg-driver/xf86-video-imx-vivante_6.2.4.p1.8.bb

XF86_VIDEO_IMX_VIVANTE_SRC ?= "git://source.codeaurora.org/external/imx/xf86-video-imx-vivante.git;protocol=https"
SRC_URI = " \
    ${XF86_VIDEO_IMX_VIVANTE_SRC};branch=${SRCBRANCH} \
    file://rc.autohdmi \
"
SRCREV = "c828e8a7c38743e960967e7bb78c134cec31c102"

# Patch for MX8 DRM_VIV
RDEPENDS_${PN}_append_mx8 = " kernel-module-vivante"
