# Copyright 2017-2018 NXP

IMX_MKIMAGE_SRC ?= "git://source.codeaurora.org/external/imx/imx-mkimage.git;protocol=https"
SRCBRANCH = "master"
SRC_URI = "${IMX_MKIMAGE_SRC};branch=${SRCBRANCH}"
SRCREV = "202f412cee9f31a4fc688911f34d9321fadd825c"

DEPENDS = "zlib-native openssl-native"
