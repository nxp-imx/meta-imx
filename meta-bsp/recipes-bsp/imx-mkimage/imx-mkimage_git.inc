# Copyright 2017-2022 NXP
 
DEPENDS = "zlib-native openssl-native"

SRCBRANCH = "master"
IMX_MKIMAGE_SRC ?= "git://source.codeaurora.org/external/imx/imx-mkimage.git;protocol=https"
SRC_URI = "${IMX_MKIMAGE_SRC};branch=${SRCBRANCH} \
           file://0001-iMX8M-soc.mak-use-native-mkimage-from-sysroot.patch \
           file://0001-iMX8M-mkimage_fit_atf.sh-Add-support-for-overriding-.patch \
           file://0002-iMX8M-soc.mak-Add-LDFLAGS-to-link-step.patch \
           file://0003-iMX8M-print_fit_hab.sh-Add-support-for-overriding-BL.patch \
"
SRCREV = "9ae3db3c23e9151679d0705d65696b044c56a9fb"
S = "${WORKDIR}/git"

BOOT_TOOLS = "imx-boot-tools"
SYSROOT_DIRS += "/boot"
