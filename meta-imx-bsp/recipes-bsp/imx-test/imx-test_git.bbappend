# Copyright (C) 2012-2016 O.S. Systems Software LTDA.
# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2025 NXP

FILESEXTRAPATHS:prepend := "${THISDIR}/imx-test:"

DEPENDS:append:mx943-nxp-bsp = " imx-lib"

SRC_URI = "${IMXTEST_SRC};branch=${SRCBRANCH} \
           file://memtool_profile"

IMXTEST_SRC ?= "git://github.com/nxp-imx/imx-test.git;protocol=https"
SRCBRANCH = "lf-6.12.49_2.2.0"
SRCREV = "5bc51ae84c55193732137d7efbe704e94c9d398a" 

PLATFORM:mx91-nxp-bsp = "IMX8"
PLATFORM:mx943-nxp-bsp = "IMX8ULP"
