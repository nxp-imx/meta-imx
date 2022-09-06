# Copyright 2017-2022 NXP
 
DEPENDS = "zlib-native openssl-native"

SRC_URI = "${IMX_MKIMAGE_SRC};branch=${SRCBRANCH} \
           file://0001-iMX8M-soc.mak-use-native-mkimage-from-sysroot.patch \
"
IMX_MKIMAGE_SRC ?= "git://github.com/nxp-imx/imx-mkimage.git;protocol=https"
SRCBRANCH = "master"
SRCREV = "fe3cdb2f207eec3435857a54c123d7c1b0472cd5"

S = "${WORKDIR}/git"

BOOT_TOOLS = "imx-boot-tools"
SYSROOT_DIRS += "/boot"
