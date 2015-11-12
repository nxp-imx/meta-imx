# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Linux Kernel provided and supported by Freescale"
DESCRIPTION = "Linux Kernel provided and supported by Freescale with focus on \
i.MX Family Reference Boards. It includes support for many IPs such as GPU, VPU and IPU."

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

inherit fsl-vivante-kernel-driver-handler

DEPENDS += "lzop-native bc-native"

SRCBRANCH = "imx_3.14.52_1.1.0_ga"
LOCALVERSION = "-1.1.0_ga"
SRCREV = "cf60ba4440fadbdb8455bf190bf7a3cc36460a15"
KERNEL_SRC ?= "git://git.freescale.com/imx/linux-2.6-imx.git;protocol=git"
SRC_URI = "${KERNEL_SRC};branch=${SRCBRANCH}"

DEFAULT_PREFERENCE = "1"

do_configure_prepend() {
   # copy latest defconfig for imx_v7_defoonfig to use
   cp ${S}/arch/arm/configs/imx_v7_defconfig ${B}/.config
   cp ${S}/arch/arm/configs/imx_v7_defconfig ${B}/../defconfig

   if [ "${MACHINE_HAS_VIVANTE_KERNEL_DRIVER_SUPPORT}" = "1" ]; then
      if [ "${MACHINE_USES_VIVANTE_KERNEL_DRIVER_MODULE}" = "1" ]; then
          new_config="# CONFIG_MXC_GPU_VIV is not set"
      else
          new_config="CONFIG_MXC_GPU_VIV=y"
      fi
      sed -i "s/.*CONFIG_MXC_GPU_VIV.*/$new_config/g" ${WORKDIR}/defconfig
   fi

}

COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"
