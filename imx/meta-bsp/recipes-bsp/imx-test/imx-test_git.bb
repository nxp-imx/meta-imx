# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017 NXP

include recipes-bsp/imx-test/imx-test.inc

DEPENDS_mx6sl += "virtual/libvpu"
DEPENDS_mx6sx += "virtual/libvpu"
DEPENDS_mx6ul += "virtual/libvpu"
DEPENDS_mx6sll += "virtual/libvpu"
DEPENDS_mx7d  += "virtual/libvpu"
DEPENDS_mx7ulp  = "virtual/kernel imx-lib virtual/libvpu"
DEPENDS_append_mx8 = " virtual/kernel alsa-lib"
DEPENDS_append_mx8mq = " virtual/kernel virtual/libvpu alsa-lib"

PLATFORM_mx6sll = "IMX6SL"
PLATFORM_mx7ulp  = "IMX7D"
PLATFORM_mx8 = "IMX8"

IMX_HAS_VPU         = "false"
IMX_HAS_VPU_imxvpu  = "true"
EXTRA_OEMAKE       += "HAS_VPU=${IMX_HAS_VPU}"

PARALLEL_MAKE="-j 1"

SRCBRANCH = "imx_4.9.11_1.0.0_ga"
SRCBRANCH_mx8 = "imx_4.9.11_imx8_alpha"
IMXTEST_SRC ?= "git://git.freescale.com/imx/imx-test.git;protocol=git"

SRC_URI = "${IMXTEST_SRC};branch=${SRCBRANCH}"
SRCREV = "fb250a795ce0d25c19610e9e19e1cd815fc64cb9"
SRCREV_mx8 = "1143e88632a1695a2e9dcd9578c5d7bfd1b65e02"

S = "${WORKDIR}/git"

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"
