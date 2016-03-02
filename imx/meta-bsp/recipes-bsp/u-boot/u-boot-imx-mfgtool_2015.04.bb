# Copyright (C) 2014 O.S. Systems Software LTDA.
# Copyright (C) 2014-2016 Freescale Semiconductor

require u-boot-imx_${PV}.bb
require recipes-bsp/u-boot/u-boot-mfgtool.inc

SRCBRANCH = "imx_v2015.04_4.1.15_1.0.0_ga"
UBOOT_SRC ?= "git://git.freescale.com/imx/uboot-imx.git;protocol=git"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCREV = "46cadd8ecd20dbb09316e2aab7b03cb4089e5f8f"
