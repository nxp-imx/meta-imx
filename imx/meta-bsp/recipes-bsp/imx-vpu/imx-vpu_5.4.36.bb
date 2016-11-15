# Copyright (C) 2013-2016 Freescale Semiconductor

require recipes-bsp/imx-vpu/imx-vpu.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=8cf95184c220e247b9917e7244124c5a"

PE = "1"

SRC_URI[md5sum] = "88fbd4f3979e51e16a31cf56fac81b34"
SRC_URI[sha256sum] = "7449ff86b2bc0a6107b782a363c189f8559fae883d19fae8e9f27527e8ecc19f"

# imx-vpu can only support imx6q platform, in order to build out the vpu case in unit test,
# using a workaround to transfer "IMX6Q" on imx6ul & imx7d platform.
PLATFORM_mx6ul = "IMX6Q"
PLATFORM_mx7 = "IMX6Q"
PLATFORM_mx6sll = "IMX6Q"

COMPATIBLE_MACHINE = "(mx6|mx6ul|mx6sll|mx7)"
