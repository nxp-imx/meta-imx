# Copyright 2017 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

SRCBRANCH = "imx_4.9.y"

LOCALVERSION = "-${SRCBRANCH}"

KERNEL_SRC ?= "git://source.codeaurora.org/external/imx/linux-imx.git;protocol=https"
SRC_URI = "${KERNEL_SRC};branch=${SRCBRANCH}"
SRCREV = "afe5030358a635a9bbb0eec15ef4b3cd856ae40d"

S = "${WORKDIR}/git"
