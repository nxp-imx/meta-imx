# Copyright 2017 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

SRCBRANCH = "imx_4.9.y"

LOCALVERSION = "-${SRCBRANCH}"

KERNEL_SRC ?= "git://git.freescale.com/imx/linux-imx.git;protocol=git"
SRC_URI = "${KERNEL_SRC};branch=${SRCBRANCH}"
SRCREV = "408c9a7f2bf85a6eddab7d6bfb69a1f6c997bcd0"

S = "${WORKDIR}/git"
