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
SRCREV = "8e7c7ca12ced513d9eae71a57e34ac5ae9a1f432"

PLATFORM:mx8ulp-nxp-bsp = "IMX8ULP"
PLATFORM:mx93-nxp-bsp = "IMX8ULP"
PLATFORM:mx95-nxp-bsp = "IMX8"
