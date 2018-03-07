# Copyright 2017-2018 NXP

IMX_MKIMAGE_SRC ?= "git://source.codeaurora.org/external/imx/imx-mkimage.git;protocol=https"
SRCBRANCH ?= "master"
SRC_URI = "${IMX_MKIMAGE_SRC};branch=${SRCBRANCH}"
SRCREV = "9f6f1abb00ab3edbf6ab7fc565dce5c0772461fb"

DEPENDS = "zlib-native openssl-native"
