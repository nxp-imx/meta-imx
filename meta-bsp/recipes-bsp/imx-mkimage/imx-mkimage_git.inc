# Copyright 2017-2020 NXP
 
DEPENDS = "zlib-native openssl-native"

SRCBRANCH = "master"
IMX_MKIMAGE_SRC ?= "git://source.codeaurora.org/external/imx/imx-mkimage.git;protocol=https"
SRC_URI = "${IMX_MKIMAGE_SRC};branch=${SRCBRANCH}"
SRCREV = "abdb3a1c95b5099fe9820137f4a43874e90c7ac3"
S = "${WORKDIR}/git"

BOOT_TOOLS = "imx-boot-tools"
SYSROOT_DIRS += "/boot"
