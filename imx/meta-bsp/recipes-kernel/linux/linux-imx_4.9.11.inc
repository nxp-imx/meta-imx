# Copyright 2017 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

SRCBRANCH = "imx_4.9.y"

LOCALVERSION = "-${SRCBRANCH}"

KERNEL_SRC ?= "git://git.freescale.com/imx/linux-imx.git;protocol=git"
SRC_URI = "${KERNEL_SRC};branch=${SRCBRANCH}"
SRCREV = "bc6cda3e57b479174e08a9eef2bee69ca7874729"

S = "${WORKDIR}/git"
