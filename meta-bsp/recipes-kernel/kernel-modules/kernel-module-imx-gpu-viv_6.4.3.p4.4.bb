# Copyright (C) 2015-2016 Freescale Semiconductor
# Copyright (C) 2017-2021 NXP

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use a newer graphics release with an older kernel."
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"

SRCBRANCH = "imx_5.15.y"
LOCALVERSION = "-lts-5.15.y"
KERNEL_SRC ?= "git://source.codeaurora.org/external/imx/linux-imx.git;protocol=https;branch=${SRCBRANCH}"
SRC_URI = " \
    ${KERNEL_SRC};subpath=drivers/mxc/gpu-viv;destsuffix=git/src \
    file://Add-makefile.patch \
"
SRCREV = "a6b1d81f087c5b1b960b8684b0a94ae9ecbbc6a4"

S = "${WORKDIR}/git"

inherit module

EXTRA_OEMAKE += "CONFIG_MXC_GPU_VIV=m"

KERNEL_MODULE_AUTOLOAD = "galcore"
COMPATIBLE_MACHINE = "(imx-nxp-bsp)"
