# Copyright 2017-2024 NXP
 
DEPENDS = "zlib-native openssl-native"

SRC_URI = "${IMX_MKIMAGE_SRC};branch=${SRCBRANCH} \
           file://0001-iMX8M-soc.mak-use-native-mkimage-from-sysroot.patch \
"
IMX_MKIMAGE_SRC ?= "git://github.com/nxp-imx/imx-mkimage.git;protocol=https"
SRCBRANCH = "lf-6.18.2_1.0.0"
SRCREV = "5728ce0e3464d7189be10c38e0a4e24941259a0c"

BOOT_TOOLS = "imx-boot-tools"
SYSROOT_DIRS += "/boot"
