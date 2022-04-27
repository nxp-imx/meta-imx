# Copyright 2017-2022 NXP
 
DEPENDS = "zlib-native openssl-native"

SRCBRANCH = "master"
IMX_MKIMAGE_SRC ?= "git://source.codeaurora.org/external/imx/imx-mkimage.git;protocol=https"
SRC_URI = "${IMX_MKIMAGE_SRC};branch=${SRCBRANCH} \
           file://0001-iMX8M-soc.mak-use-native-mkimage-from-sysroot.patch \
           file://0001-Add-support-for-overriding-BL32-and-BL33-not-only-BL.patch \
           file://0001-Add-LDFLAGS-to-link-step.patch \
           file://0001-Add-support-for-overriding-BL31-BL32-and-BL33.patch \
"
SRCREV = "3ed3fb71e6eb443d86d72197325af0e9373cb3e6"
S = "${WORKDIR}/git"

BOOT_TOOLS = "imx-boot-tools"
SYSROOT_DIRS += "/boot"
