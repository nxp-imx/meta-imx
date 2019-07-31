# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2018 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Linux Kernel provided and supported by NXP"
DESCRIPTION = "Linux Kernel provided and supported by NXP with focus on \
i.MX Family Reference Boards. It includes support for many IPs such as GPU, VPU and IPU."

require recipes-kernel/linux/linux-imx.inc

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"
DEPENDS += "lzop-native bc-native"

SRCBRANCH = "imx_4.19.y"
LOCALVERSION = "-1.1.0"
KERNEL_SRC ?= "git://source.codeaurora.org/external/imx/linux-imx.git;protocol=https"
SRC_URI = "${KERNEL_SRC};branch=${SRCBRANCH}"
SRCREV = "512a9be1107cead313e4776ce86e600fb22a9f73"

S = "${WORKDIR}/git"

DEFAULT_PREFERENCE = "1"

DEFCONFIG     = "defconfig"
DEFCONFIG_mx6 = "imx_v7_defconfig"
DEFCONFIG_mx7 = "imx_v7_defconfig"

patch_imx_v7_defconfig() {
    cat >> ${S}/arch/arm/configs/imx_v7_defconfig << EOM

# Greengrass Namespace
CONFIG_IPC_NS=y
CONFIG_UTS_NS=y
CONFIG_USER_NS=y
CONFIG_PID_NS=y
CONFIG_MULTIUSER=y
CONFIG_NAMESPACES=y
CONFIG_NET_NS=y

# Greengrass Cgroups
CONFIG_CGROUP_DEVICE=y
CONFIG_CGROUPS=y
CONFIG_MEMCG=y
CONFIG_CGROUP_FREEZER=y
CONFIG_CGROUP_PIDS=y

# Greengrass Others
CONFIG_POSIX_MQUEUE=y
CONFIG_OVERLAY_FS=y
CONFIG_HAVE_ARCH_SECCOMP_FILTER=y
CONFIG_SECCOMP_FILTER=y
CONFIG_KEYS=y
CONFIG_SECCOMP=y
CONFIG_OF_OVERLAY=y
CONFIG_DEVPTS_MULTIPLE_INSTANCES=y

EOM
}

do_patch_append() {
    if d.getVar('DEFCONFIG') == 'imx_v7_defconfig':
        bb.build.exec_func('patch_imx_v7_defconfig', d)
}

do_preconfigure_prepend() {
    # meta-freescale/classes/fsl-kernel-localversion.bbclass requires
    # defconfig in ${WORKDIR}
    install -d ${B}
    cp ${S}/arch/${ARCH}/configs/${DEFCONFIG} ${WORKDIR}/defconfig
}

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"
