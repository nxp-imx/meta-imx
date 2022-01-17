# Copyright 2017-2020 NXP
 
DEPENDS = "zlib-native openssl-native"

SRCBRANCH = "imx_5.4.70_2.3.0"
IMX_MKIMAGE_SRC ?= "git://source.codeaurora.org/external/imx/imx-mkimage.git;protocol=https"
SRC_URI = "${IMX_MKIMAGE_SRC};branch=${SRCBRANCH}"
SRCREV = "7d17f8470b5897c51dfb7800d1ea18e606985897"
S = "${WORKDIR}/git"

BOOT_TOOLS = "imx-boot-tools"
SYSROOT_DIRS += "/boot"
