# Copyright 2017-2024 NXP

DEPENDS = "zlib-native openssl-native"

SRC_URI = "${IMX_MKIMAGE_SRC};branch=${SRCBRANCH} \
           file://0001-iMX8M-soc.mak-use-native-mkimage-from-sysroot.patch \
"
IMX_MKIMAGE_SRC ?= "git://github.com/nxp-imx/imx-mkimage.git;protocol=https"
SRCBRANCH = "lf-6.18.37_2.1.0"
SRCREV = "4c1137f7fb79d45fbec46be18e6c6126c4bf82db"

BOOT_TOOLS = "imx-boot-tools"
SYSROOT_DIRS += "/boot"
