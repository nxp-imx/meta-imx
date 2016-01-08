# Copyright (C) 2013-2015 Freescale Semiconductor

require recipes-bsp/imx-vpu/imx-vpu.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=3880bb9c943b135a30fad5e8aabd3ee9"

PE = "1"

SRC_URI[md5sum] = "d57b5b936a31f9932b8777cb295d6a65"
SRC_URI[sha256sum] = "2bca98625a3b9eabefe09c48d0cd8f3b7a34d9a7ad8e34c1ad802c578eac66b5"



# imx-vpu can only support imx6q platform, in order to build out the vpu case in unit test,
# using a workaround to transfer "IMX6Q" on imx6ul & imx7d platform.
PLATFORM_mx6ul = "IMX6Q"
PLATFORM_mx7 = "IMX6Q"

COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"
