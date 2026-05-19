# Copyright 2017-2024 NXP
 
DEPENDS = "zlib-native openssl-native"

SRC_URI = "${IMX_MKIMAGE_SRC};branch=${SRCBRANCH} \
           file://0001-iMX8M-soc.mak-use-native-mkimage-from-sysroot.patch \
"
IMX_MKIMAGE_SRC ?= "git://github.com/nxp-imx/imx-mkimage.git;protocol=https"
SRCBRANCH = "lf-6.18.20_2.0.0"
SRCREV = "e6ba3112249a699f276e285182d2915b297c2e7f"

BOOT_TOOLS = "imx-boot-tools"
SYSROOT_DIRS += "/boot"
