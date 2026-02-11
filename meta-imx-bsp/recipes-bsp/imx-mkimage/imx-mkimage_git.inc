# Copyright 2017-2024 NXP
 
DEPENDS = "zlib-native openssl-native"

SRC_URI = "${IMX_MKIMAGE_SRC};branch=${SRCBRANCH} \
           file://0001-iMX8M-soc.mak-use-native-mkimage-from-sysroot.patch \
"
IMX_MKIMAGE_SRC ?= "git://github.com/nxp-imx/imx-mkimage.git;protocol=https"
SRCBRANCH = "lf-6.18.2_1.0.0"
SRCREV = "f8939418286338c49d840e8216b3bfa850be0b71"

BOOT_TOOLS = "imx-boot-tools"
SYSROOT_DIRS += "/boot"
