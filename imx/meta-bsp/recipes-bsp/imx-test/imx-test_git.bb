# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017 NXP

include recipes-bsp/imx-test/imx-test.inc

DEPENDS_mx6sl += "virtual/libvpu"
DEPENDS_mx6sx += "virtual/libvpu"
DEPENDS_mx6ul += "virtual/libvpu"
DEPENDS_mx6sll += "virtual/libvpu"
DEPENDS_mx7d  += "virtual/libvpu"
DEPENDS_mx7ulp  = "virtual/kernel imx-lib virtual/libvpu"

PLATFORM_mx6sll = "IMX6SL"
PLATFORM_mx7ulp  = "IMX7D"

PARALLEL_MAKE="-j 1"

SRCBRANCH = "master"
IMXTEST_SRC ?= "git://git.freescale.com/imx/imx-test.git;protocol=git"

SRC_URI = "${IMXTEST_SRC};branch=${SRCBRANCH}"
SRCREV = "537d4f842987af7b4772787ab5d769868a02cc1f"

S = "${WORKDIR}/git"

COMPATIBLE_MACHINE = "(mx6|mx7)"
