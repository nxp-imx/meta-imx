# Copyright (C) 2014 O.S. Systems Software LTDA.

require u-boot-imx_${PV}.bb
require recipes-bsp/u-boot/u-boot-mfgtool.inc

SRCBRANCH = "imx_v2015.04"
UBOOT_SRC ?= "git://git.freescale.com/imx/uboot-imx.git;protocol=git"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCREV = "3c38fae6dafd3b90fae2598dcbedf6cb7aa6f6af"
