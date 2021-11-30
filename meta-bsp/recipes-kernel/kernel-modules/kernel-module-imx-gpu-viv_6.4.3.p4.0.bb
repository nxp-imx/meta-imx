# Copyright (C) 2015-2016 Freescale Semiconductor
# Copyright (C) 2017-2021 NXP

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use a newer graphics release with an older kernel."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"

SRCBRANCH = "next"
LOCALVERSION = "-lts-5.10.y"
KERNEL_SRC ?= "git://source.codeaurora.org/external/imx/linux-imx.git;protocol=https;branch=${SRCBRANCH}"
SRC_URI = " \
    ${KERNEL_SRC};subpath=drivers/mxc/gpu-viv;destsuffix=git/src \
    file://Add-makefile.patch \
"
SRCREV = "f382c5cbf2d9ecdd6474a6c81da960378c7dca1b"

S = "${WORKDIR}/git"

inherit module

EXTRA_OEMAKE += "CONFIG_MXC_GPU_VIV=m"

KERNEL_MODULE_AUTOLOAD = "galcore"
COMPATIBLE_MACHINE = "(imx)"
