# Copyright 2017-2024 NXP
 
DEPENDS = "zlib-native openssl-native"

SRC_URI = "${IMX_MKIMAGE_SRC};branch=${SRCBRANCH} \
           file://0001-iMX8M-soc.mak-use-native-mkimage-from-sysroot.patch \
"
IMX_MKIMAGE_SRC ?= "git://github.com/nxp-imx/imx-mkimage.git;protocol=https"
SRCBRANCH = "lf-6.12.3_1.0.0"
SRCREV = "c0c69cbda755627f5393d648a7c706ddadc7cf98"

S = "${WORKDIR}/git"

BOOT_TOOLS = "imx-boot-tools"
SYSROOT_DIRS += "/boot"
