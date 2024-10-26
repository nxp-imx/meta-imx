# Copyright (C) 2012-2016 O.S. Systems Software LTDA.
# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2022 NXP

FILESEXTRAPATHS:prepend := "${THISDIR}/imx-test:"

DEPENDS:append:mx8ulp-nxp-bsp = " imx-lib"
DEPENDS:append:mx93-nxp-bsp = " imx-lib"

SRC_URI = "${IMXTEST_SRC};branch=${SRCBRANCH} \
           file://memtool_profile"

IMXTEST_SRC ?= "git://github.com/nxp-imx/imx-test.git;protocol=https"
SRCBRANCH = "master"
SRCREV = "3ee0114cab20defa7ae9f87b58dc1e370af1dc79"

PLATFORM:mx8ulp-nxp-bsp = "IMX8ULP"
PLATFORM:mx91-nxp-bsp = "IMX8"
PLATFORM:mx93-nxp-bsp = "IMX8ULP"
PLATFORM:mx95-nxp-bsp = "IMX8"
