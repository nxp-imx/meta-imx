# Copyright 2017-2020 NXP
 
DEPENDS = "zlib-native openssl-native"

SRCBRANCH = "master"
IMX_MKIMAGE_SRC ?= "git://source.codeaurora.org/external/imx/imx-mkimage.git;protocol=https"
SRC_URI = "${IMX_MKIMAGE_SRC};branch=${SRCBRANCH}"
SRCREV = "85dea64471d18faec012d67fe9403cefe8cc4b2e"
S = "${WORKDIR}/git"

BOOT_TOOLS = "imx-boot-tools"
SYSROOT_DIRS += "/boot"
