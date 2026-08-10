# Copyright 2017-2024 NXP

DEPENDS = "zlib-native openssl-native"

SRC_URI = "${IMX_MKIMAGE_SRC};branch=${SRCBRANCH} \
           file://0001-iMX8M-soc.mak-use-native-mkimage-from-sysroot.patch \
"
IMX_MKIMAGE_SRC ?= "git://github.com/nxp-imx/imx-mkimage.git;protocol=https"
SRCBRANCH = "lf-6.18.37_2.1.0"
SRCREV = "7b767eca14ad83ec37c4bb2381c6cf1ecb52c649"

BOOT_TOOLS = "imx-boot-tools"
SYSROOT_DIRS += "/boot"
