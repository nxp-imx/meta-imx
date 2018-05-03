# Copyright 2017-2018 NXP

IMX_MKIMAGE_SRC ?= "git://source.codeaurora.org/external/imx/imx-mkimage.git;protocol=https"
SRCBRANCH = "imx_4.9.88_im8qxp_beta2"
SRC_URI = "${IMX_MKIMAGE_SRC};branch=${SRCBRANCH}"
SRCREV = "4324851c443aaa5c8d12d778719f3bdeba4931d9" 

DEPENDS = "zlib-native openssl-native"
