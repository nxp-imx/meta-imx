# Copyright 2017-2018 NXP

IMX_MKIMAGE_SRC ?= "git://source.codeaurora.org/external/imx/imx-mkimage.git;protocol=https"
SRCBRANCH = "master"
SRC_URI = "${IMX_MKIMAGE_SRC};branch=${SRCBRANCH}"
SRCREV = "47bd9c9e450cbe08b5c98619621e9b70505e357b"

DEPENDS = "zlib-native openssl-native"
