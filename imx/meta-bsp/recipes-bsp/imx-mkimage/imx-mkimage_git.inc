# Copyright 2017-2018 NXP

DEPENDS = "zlib-native openssl-native"

SRCBRANCH = "master"
IMX_MKIMAGE_SRC ?= "git://source.codeaurora.org/external/imx/imx-mkimage.git;protocol=https"
SRC_URI = "${IMX_MKIMAGE_SRC};branch=${SRCBRANCH}"
SRCREV = "a31abfabc31e0b9563920504a9793da9f5e751a4"
S = "${WORKDIR}/git"

BOOT_TOOLS = "imx-boot-tools"
SYSROOT_DIRS += "/boot"
