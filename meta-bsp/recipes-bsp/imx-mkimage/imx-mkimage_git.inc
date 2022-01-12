# Copyright 2017-2021 NXP
 
DEPENDS = "zlib-native openssl-native"

SRCBRANCH = "master"
IMX_MKIMAGE_SRC ?= "git://source.codeaurora.org/external/imx/imx-mkimage.git;protocol=https"
SRC_URI = "${IMX_MKIMAGE_SRC};branch=${SRCBRANCH} \
           file://0001-iMX8M-soc.mak-use-native-mkimage-from-sysroot.patch "
SRCREV = "b42b048dd29ef3e624a3f59b173d3a40f1e34eaa"
S = "${WORKDIR}/git"

BOOT_TOOLS = "imx-boot-tools"
SYSROOT_DIRS += "/boot"
