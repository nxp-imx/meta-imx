# Copyright 2017-2024 NXP
 
DEPENDS = "zlib-native openssl-native"

SRC_URI = "${IMX_MKIMAGE_SRC};branch=${SRCBRANCH} \
           file://0001-iMX8M-soc.mak-use-native-mkimage-from-sysroot.patch \
"
IMX_MKIMAGE_SRC ?= "git://github.com/nxp-imx/imx-mkimage.git;protocol=https"
SRCBRANCH = "lf-6.18.20_2.0.0"
SRCREV = "081d4080b99d278307dfb8b7a1f481c5fc4596df"

BOOT_TOOLS = "imx-boot-tools"
SYSROOT_DIRS += "/boot"
