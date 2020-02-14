# Copyright 2017-2019 NXP
 
DEPENDS = "zlib-native openssl-native"

SRCBRANCH = "master"
IMX_MKIMAGE_SRC ?= "git://source.codeaurora.org/external/imx/imx-mkimage.git;protocol=https"
SRC_URI = "${IMX_MKIMAGE_SRC};branch=${SRCBRANCH}"
SRCREV = "7fc476edfb41c286b963259455d6542f10b8aa48"
S = "${WORKDIR}/git"

BOOT_TOOLS = "imx-boot-tools"
SYSROOT_DIRS += "/boot"
