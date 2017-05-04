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

SRC_URI[md5sum] = "98610e996494418c794824e5331eb834"
SRC_URI[sha256sum] = "10ffc50e64fe66b47e3e430242b46f2e3f4c518c3e666fc436e89362272c0e9e"

COMPATIBLE_MACHINE = "(mx6|mx7)"
