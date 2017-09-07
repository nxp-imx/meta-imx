# Copyright 2017 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

SRCBRANCH_mx6 = "imx_4.9.11_imx8_alpha"
SRCBRANCH_mx7 = "imx_4.9.11_imx8_alpha"
SRCBRANCH_mx8 = "imx_4.9.11_imx8_alpha"

LOCALVERSION = "-MX8_alpha"

KERNEL_SRC ?= "git://git.freescale.com/imx/linux-imx.git;protocol=git"
SRC_URI = "${KERNEL_SRC};branch=${SRCBRANCH}"
SRCREV_mx6 = "d7ce3f1a68cb8beb3769d7d5179af9664e0db156"
SRCREV_mx7 = "d7ce3f1a68cb8beb3769d7d5179af9664e0db156"
SRCREV_mx8 = "d7ce3f1a68cb8beb3769d7d5179af9664e0db156"

S = "${WORKDIR}/git"
