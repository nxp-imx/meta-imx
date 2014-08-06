# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Linux Kernel provided and supported by Freescale"
DESCRIPTION = "Linux Kernel provided and supported by Freescale with focus on \
i.MX Family Reference Boards. It includes support for many IPs such as GPU, VPU and IPU."

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

SRCBRANCH = "imx_3.10.31_1.1.0_beta"
SRCREV = "ef3bce5feb2ed36c9f4483287454d35ae330dbe3"
LOCALVERSION = "-1.1.0_beta"
SRC_URI = "git://${FSL_ARM_GIT_SERVER}/linux-2.6-imx.git;protocol=git;branch=${SRCBRANCH}"

DEFAULT_PREFERENCE = "1"

do_configure_prepend() {
   # In some cases we'll use a different defconfig
   # example is manufacturing image which uses imx_v7_mfg_defconfig
   # however need way to change it back during daily build

   if [ -z "${FSL_KERNEL_DEFCONFIG}" ] ; then
       echo " defconfig from local.conf not set"
       fsl_defconfig='imx_v7_defconfig'
   else
       echo " Use local.conf for defconfig to set"
       fsl_defconfig=${FSL_KERNEL_DEFCONFIG}
   fi

   # check that defconfig file exists
   if [ ! -e "${S}/arch/arm/configs/$fsl_defconfig" ]; then
       fsl_defconfig='imx_v7_defconfig'
   fi

   cp ${S}/arch/arm/configs/${fsl_defconfig} ${S}/.config
   cp ${S}/arch/arm/configs/${fsl_defconfig} ${S}/../defconfig
}

# copy zImage to deploy directory
# update uImage with defconfig ane git info in name
# this is since build script can build multiple ways
# and will overwrite previous builds

do_deploy_append () {
    install -d ${DEPLOY_DIR_IMAGE}

    if [ -z "${FSL_KERNEL_DEFCONFIG}" ] ; then
       fsl_defconfig='imx_v7_defconfig'
    else
       fsl_defconfig=${FSL_KERNEL_DEFCONFIG}
       # check that defconfig file exists
       if [ ! -e "${S}/arch/arm/configs/${FSL_KERNEL_DEFCONFIG}" ]; then
           fsl_defconfig='imx_v7_defconfig'
       fi
    fi

# comment out uImage
    install  arch/arm/boot/zImage ${DEPLOY_DIR_IMAGE}/zImage_$fsl_defconfig
}

COMPATIBLE_MACHINE = "(mx6)"
