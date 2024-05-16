# Copyright 2017-2023 NXP
 
DEPENDS = "zlib-native openssl-native"

SRC_URI = "${IMX_MKIMAGE_SRC};branch=${SRCBRANCH} \
           file://0001-iMX8M-soc.mak-use-native-mkimage-from-sysroot.patch \
"
IMX_MKIMAGE_SRC ?= "git://github.com/nxp-imx/imx-mkimage.git;protocol=https"
SRCBRANCH = "master"
SRCREV = "f2fb6e55f636b0cd728601aa4d2cd0e52c7c9513"

S = "${WORKDIR}/git"

BOOT_TOOLS = "imx-boot-tools"
SYSROOT_DIRS += "/boot"
