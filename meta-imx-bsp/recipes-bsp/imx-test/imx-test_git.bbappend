# Copyright (C) 2012-2016 O.S. Systems Software LTDA.
# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2025 NXP

FILESEXTRAPATHS:prepend := "${THISDIR}/imx-test:"

DEPENDS:append:mx943-nxp-bsp = " imx-lib"

SRC_URI = "${IMXTEST_SRC};branch=${SRCBRANCH} \
           file://memtool_profile"

IMXTEST_SRC ?= "git://github.com/nxp-imx/imx-test.git;protocol=https"
SRCBRANCH = "lf-6.12.34_2.1.0"
SRCREV = "88a4f07772d75aed9b53fdc0cd7ceb80f76f75d3"

PLATFORM:mx91-nxp-bsp = "IMX8"
PLATFORM:mx943-nxp-bsp = "IMX8ULP"
