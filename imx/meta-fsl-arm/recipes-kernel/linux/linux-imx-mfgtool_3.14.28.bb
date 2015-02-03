# Copyright (C) 2014 O.S. Systems Software LTDA.
# Copyright (C) 2014, 2015 Freescale Semiconductor

SUMMARY = "Produces a Manufacturing Tool compatible Linux Kernel"
DESCRIPTION = "Linux Kernel provided and supported by Freescale that produces a \
Manufacturing Tool compatible Linux Kernel to be used in updater environment"

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc
require recipes-kernel/linux/linux-mfgtool.inc

DEPENDS += "lzop-native bc-native"

SRCBRANCH = "imx_3.14.y"
LOCALVERSION = "-1.0.0_ga"
SRCREV = "a745133191bfe0c2ca408d9f8bcfc2a5204b0dbd"
SRC_URI = "git://${FSL_ARM_GIT_SERVER}/linux-2.6-imx.git;protocol=git;branch=${SRCBRANCH}"

DEFAULT_PREFERENCE = "1"

do_configure_prepend() {
    cp ${S}/arch/arm/configs/imx_v7_mfg_defconfig ${S}/.config
    cp ${S}/arch/arm/configs/imx_v7_mfg_defconfig ${S}/../defconfig
}

# copy zImage to deploy directory
# update uImage with defconfig ane git info in name
# this is since build script can build multiple ways
# and will overwrite previous builds

do_deploy () {
    install -d ${DEPLOY_DIR_IMAGE}
    install  arch/arm/boot/zImage ${DEPLOY_DIR_IMAGE}/zImage_mfgtool
}
