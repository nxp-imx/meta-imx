# Copyright 2017-2018 NXP

IMX_MKIMAGE_SRC ?= "git://source.codeaurora.org/external/imx/imx-mkimage.git;protocol=https"
SRCBRANCH = "imx_4.14.98_2.0.0_ga"
SRC_URI = "${IMX_MKIMAGE_SRC};branch=${SRCBRANCH}"
SRCREV = "49f2575f25fa2ba7d1f95faad7a5ecda8b55185f"

DEPENDS = "zlib-native openssl-native"
