# Copyright (C) 2013-2015 Freescale Semiconductor

require recipes-bsp/imx-vpu/imx-vpu.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=3880bb9c943b135a30fad5e8aabd3ee9"

PE = "1"

SRC_URI[md5sum] = "ed075299baaa0e0cbdb2e9cbd6262994"
SRC_URI[sha256sum] = "a6815593f41d01db7d6768a48bd4ee9c3ab5b7b62d305cd231b9753d5976b3c7"



# imx-vpu can only support imx6q platform, in order to build out the vpu case in unit test,
# using a workaround to transfer "IMX6Q" on imx6ul & imx7d platform.
PLATFORM_mx6ul = "IMX6Q"
PLATFORM_mx7 = "IMX6Q"

COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"
