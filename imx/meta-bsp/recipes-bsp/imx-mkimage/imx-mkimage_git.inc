# Copyright 2017-2018 NXP

IMX_MKIMAGE_SRC ?= "git://source.codeaurora.org/external/imx/imx-mkimage.git;protocol=https"
SRCBRANCH = "imx_4.14.98_2.2.0"
SRC_URI = "${IMX_MKIMAGE_SRC};branch=${SRCBRANCH}"
SRCREV = "c00cd78d2e80178171d2d7f8d0d1ce6e2ea41ac5"

DEPENDS = "zlib-native openssl-native"
