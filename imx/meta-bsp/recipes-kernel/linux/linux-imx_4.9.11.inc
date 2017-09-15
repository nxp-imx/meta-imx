# Copyright 2017 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

SRCBRANCH = "imx_4.9.y"

LOCALVERSION = "-${SRCBRANCH}"

KERNEL_SRC ?= "git://git.freescale.com/imx/linux-imx.git;protocol=git"
SRC_URI = "${KERNEL_SRC};branch=${SRCBRANCH}"
SRCREV = "9c31f7bf938adb9a808ea7bf637ccecf53f6e7be"

S = "${WORKDIR}/git"
