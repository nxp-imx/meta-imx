# Copyright (C) 2013-2015 Freescale Semiconductor

require recipes-bsp/imx-vpu/imx-vpu.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=3880bb9c943b135a30fad5e8aabd3ee9"

PE = "1"

SRC_URI[md5sum] = "d7bfe9f96169f4637327436a4e848dae"
SRC_URI[sha256sum] = "f11b91dcdb84bfefd3c88f10a9c1c1bc3420e4bbaadc38b9280fb52f7769eca8"



# imx-vpu can only support imx6q platform, in order to build out the vpu case in unit test,
# using a workaround to transfer "IMX6Q" on imx6ul & imx7d platform.
PLATFORM_mx6ul = "IMX6Q"
PLATFORM_mx7 = "IMX6Q"

COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"
