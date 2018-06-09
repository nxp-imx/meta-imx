# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2018 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-imx.inc

SUMMARY = "Linux Kernel provided and supported by NXP"
DESCRIPTION = "Linux Kernel provided and supported by NXP with focus on \
i.MX Family Reference Boards. It includes support for many IPs such as GPU, VPU and IPU."

DEPENDS += "lzop-native bc-native"

SRCBRANCH = "imx_4.9.y"
LOCALVERSION = "-${SRCBRANCH}"
KERNEL_SRC ?= "git://source.codeaurora.org/external/imx/linux-imx.git;protocol=https"
SRC_URI = "${KERNEL_SRC};branch=${SRCBRANCH}"
SRC_URI += "file://0001-ion-Add-userspace-header-ion.h-to-Linux-userspace.patch"
SRCREV = "e38e289e2dada1a55bfabdcb2315aa764bf40400"

DEFAULT_PREFERENCE = "1"

DO_CONFIG_V7_COPY = "no"
DO_CONFIG_V7_COPY_mx6 = "yes"
DO_CONFIG_V7_COPY_mx7 = "yes"
DO_CONFIG_V7_COPY_mx8 = "no"

addtask copy_defconfig after do_unpack before do_preconfigure
do_copy_defconfig () {
    install -d ${B}
    if [ ${DO_CONFIG_V7_COPY} = "yes" ]; then
        # copy latest imx_v7_defconfig to use for mx6, mx6ul and mx7
        mkdir -p ${B}
        cp ${S}/arch/arm/configs/imx_v7_defconfig ${B}/.config
        cp ${S}/arch/arm/configs/imx_v7_defconfig ${B}/../defconfig
    else
        # copy latest defconfig to use for mx8
        mkdir -p ${B}
        cp ${S}/arch/arm64/configs/defconfig ${B}/.config
        cp ${S}/arch/arm64/configs/defconfig ${B}/../defconfig
    fi
}

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"
EXTRA_OEMAKE_append_mx6 = " ARCH=arm"
EXTRA_OEMAKE_append_mx7 = " ARCH=arm"
EXTRA_OEMAKE_append_mx8 = " ARCH=arm64"
