# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)
#
# SPDX-License-Identifier: MIT
#

SUMMARY = "Linux Kernel provided and supported by NXP"
DESCRIPTION = "Linux Kernel provided and supported by NXP with focus on \
i.MX Family Reference Boards. It includes support for many IPs such as GPU, VPU and IPU."

require recipes-kernel/linux/linux-imx.inc

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

DEPENDS += "lzop-native bc-native"

SRCBRANCH = "lf-5.10.y"
LOCALVERSION = "-lts-5.10.y"
KERNEL_SRC ?= "git://github.com/nxp-imx/linux-imx.git;protocol=https"
SRC_URI = "${KERNEL_SRC};branch=${SRCBRANCH}"

SRCREV = "a11753a89ec610768301d4070e10b8bd60fde8cd"

# PV is defined in the base in linux-imx.inc file and uses the LINUX_VERSION definition
# required by kernel-yocto.bbclass.
#
# LINUX_VERSION define should match to the kernel version referenced by SRC_URI and
# should be updated once patchlevel is merged.
LINUX_VERSION = "5.10.52"

FILES_${KERNEL_PACKAGE_NAME}-base += "${nonarch_base_libdir}/modules/${KERNEL_VERSION}/modules.builtin.modinfo "

KERNEL_CONFIG_COMMAND = "oe_runmake_call -C ${S} CC="${KERNEL_CC}" O=${B} olddefconfig"

DEFAULT_PREFERENCE = "1"

DO_CONFIG_V7_COPY = "no"
DO_CONFIG_V7_COPY_mx6 = "yes"
DO_CONFIG_V7_COPY_mx7 = "yes"
DO_CONFIG_V7_COPY_mx8 = "no"

# Add setting for LF Mainline build
IMX_KERNEL_CONFIG_AARCH32 = "imx_v7_defconfig"
IMX_KERNEL_CONFIG_AARCH64 = "imx_v8_defconfig"
KBUILD_DEFCONFIG ?= ""
KBUILD_DEFCONFIG_mx6= "${IMX_KERNEL_CONFIG_AARCH32}"
KBUILD_DEFCONFIG_mx7= "${IMX_KERNEL_CONFIG_AARCH32}"
KBUILD_DEFCONFIG_mx8= "${IMX_KERNEL_CONFIG_AARCH64}"


# Use a verbatim copy of the defconfig from the linux-imx repo.
# IMPORTANT: This task effectively disables kernel config fragments
# since the config fragments applied in do_kernel_configme are replaced.
addtask copy_defconfig after do_kernel_configme before do_kernel_localversion
do_copy_defconfig () {
    install -d ${B}
    if [ ${DO_CONFIG_V7_COPY} = "yes" ]; then
        # copy latest IMX_KERNEL_CONFIG_AARCH32 to use for mx6, mx6ul and mx7
        mkdir -p ${B}
        cp ${S}/arch/arm/configs/${IMX_KERNEL_CONFIG_AARCH32} ${B}/.config
    else
        # copy latest IMX_KERNEL_CONFIG_AARCH64 to use for mx8
        mkdir -p ${B}
        cp ${S}/arch/arm64/configs/${IMX_KERNEL_CONFIG_AARCH64} ${B}/.config
    fi
}

DELTA_KERNEL_DEFCONFIG ?= ""
#DELTA_KERNEL_DEFCONFIG_mx8 = "imx.config"

do_merge_delta_config[dirs] = "${B}"
do_merge_delta_config[depends] += " \
    flex-native:do_populate_sysroot \
    bison-native:do_populate_sysroot \
"
do_merge_delta_config() {
    for deltacfg in ${DELTA_KERNEL_DEFCONFIG}; do
        if [ -f ${S}/arch/${ARCH}/configs/${deltacfg} ]; then
            ${KERNEL_CONFIG_COMMAND}
            oe_runmake_call -C ${S} CC="${KERNEL_CC}" O=${B} ${deltacfg}
        elif [ -f "${WORKDIR}/${deltacfg}" ]; then
            ${S}/scripts/kconfig/merge_config.sh -m .config ${WORKDIR}/${deltacfg}
        elif [ -f "${deltacfg}" ]; then
            ${S}/scripts/kconfig/merge_config.sh -m .config ${deltacfg}
        fi
    done
    cp .config ${WORKDIR}/defconfig
}
addtask merge_delta_config before do_kernel_localversion after do_copy_defconfig

KERNEL_VERSION_SANITY_SKIP="1"
COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"
