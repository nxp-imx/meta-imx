# Copyright 2017-2024 NXP
 
DEPENDS = "zlib-native openssl-native"

SRC_URI = "${IMX_MKIMAGE_SRC};branch=${SRCBRANCH} \
           file://0001-iMX8M-soc.mak-use-native-mkimage-from-sysroot.patch \
"
IMX_MKIMAGE_SRC ?= "git://github.com/nxp-imx/imx-mkimage.git;protocol=https"
SRCBRANCH = "master"
SRCREV = "77ad8ff78f80e54bee4fe86f1e5e91a8dc6889d0"

BOOT_TOOLS = "imx-boot-tools"
SYSROOT_DIRS += "/boot"
