# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Copyright 2017 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRCBRANCH = "imx_4.9.51_imx8_beta1"
XF86_VIDEO_IMX_VIVANTE_SRC ?= "git://source.codeaurora.org/external/imx/xf86-video-imx-vivante.git;protocol=https"
SRC_URI  = "${XF86_VIDEO_IMX_VIVANTE_SRC};branch=${SRCBRANCH}"
SRC_URI += "file://rc.autohdmi"
SRCREV = "30163df36c62b3375dfd77adb18e46fb5fbc0c77" 

S = "${WORKDIR}/git/"

DEPENDS += "virtual/libg2d pixman"

EXTRA_OEMAKE += "'ROOTFS=${STAGING_DIR_HOST}'"

TARGET_CC_ARCH += "${LDFLAGS}"

EXTRA_OEMAKE_remove = "prefix=${D}/usr"
EXTRA_OEMAKE += "prefix=${exec_prefix}"

RDEPENDS_${PN}_remove = "libvivante-dri-mx6"
RDEPENDS_${PN}_remove_mx8mq = "xserver-xorg-extension-glx"
RDEPENDS_${PN}_append = " libvivante-dri-imx"

COMPATIBLE_MACHINE = "(mx6|mx8|mx7ulp)"
