# Copyright (C) 2014 O.S. Systems Software LTDA.
SUMMARY = "Produces a Manufacturing Tool compatible Linux Kernel"
DESCRIPTION = "Linux Kernel provided and supported by Freescale that produces a \
Manufacturing Tool compatible Linux Kernel to be used in updater environment"

require linux-imx_${PV}.bb
require recipes-kernel/linux/linux-mfgtool.inc

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

    install  arch/arm/boot/uImage ${DEPLOY_DIR_IMAGE}/uImage_mfgtool
    install  arch/arm/boot/zImage ${DEPLOY_DIR_IMAGE}/zImage_mfgtool
}



