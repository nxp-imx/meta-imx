# Copyright (C) 2012-2016 O.S. Systems Software LTDA.
# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2025 NXP

FILESEXTRAPATHS:prepend := "${THISDIR}/imx-test:"

DEPENDS:append:mx943-nxp-bsp = " imx-lib"

SRC_URI = "${IMXTEST_SRC};branch=${SRCBRANCH} \
           file://memtool_profile"

IMXTEST_SRC ?= "git://github.com/nxp-imx/imx-test.git;protocol=https"
SRCBRANCH = "lf-6.18.2_1.0.0"
SRCREV = "e5dad74f8defd6108cac5ba21bf4ff268445d3ff"

PLATFORM:mx91-nxp-bsp = "IMX8"
PLATFORM:mx943-nxp-bsp = "IMX8ULP"
