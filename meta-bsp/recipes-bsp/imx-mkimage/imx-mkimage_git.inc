# Copyright 2017-2021 NXP
 
DEPENDS = "zlib-native openssl-native"

SRCBRANCH = "lf-5.10.y_2.0.0"
IMX_MKIMAGE_SRC ?= "git://source.codeaurora.org/external/imx/imx-mkimage.git;protocol=https"
SRC_URI = "${IMX_MKIMAGE_SRC};branch=${SRCBRANCH}"
SRCREV = "5138add7602a50d1730a54d0b67219f0ce0666b4"
S = "${WORKDIR}/git"

BOOT_TOOLS = "imx-boot-tools"
SYSROOT_DIRS += "/boot"
