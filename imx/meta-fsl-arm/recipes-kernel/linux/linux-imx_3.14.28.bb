# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Linux Kernel provided and supported by Freescale"
DESCRIPTION = "Linux Kernel provided and supported by Freescale with focus on \
i.MX Family Reference Boards. It includes support for many IPs such as GPU, VPU and IPU."

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

SRCBRANCH = "imx_3.14.y"
LOCALVERSION = "-7D_alpha"
SRCREV = "382a91e3fac8faf1adf90addb739e97fea0cbe16"
KERNEL_SRC ?= "git://git.freescale.com/imx/linux-2.6-imx.git;protocol=git"
SRC_URI = "${KERNEL_SRC};branch=${SRCBRANCH}"

DEFAULT_PREFERENCE = "1"

do_configure_prepend() {
   # copy latest defconfig for imx_v7_defoonfig to use
   cp ${S}/arch/arm/configs/imx_v7_defconfig ${B}/.config
   cp ${S}/arch/arm/configs/imx_v7_defconfig ${B}/../defconfig

   if [ "${SCMVERSION}" = "y" ]; then
        # Add GIT revision to the local version
        head=`git --git-dir=${S}/.git rev-parse --verify --short HEAD 2> /dev/null`
        printf "%s%s" +g $head > ${S}/.scmversion
   fi
}

COMPATIBLE_MACHINE = "(mx6|mx7)"
