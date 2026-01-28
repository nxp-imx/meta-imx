# Copyright (C) 2015-2016 Freescale Semiconductor
# Copyright (C) 2017-2026 NXP

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use a newer graphics release with an older kernel."
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "${LINUX_IMX_SRC};subpath=drivers/mxc/gpu-viv;destsuffix=${BB_GIT_DEFAULT_DESTSUFFIX}/src \
           file://Add-makefile.patch"
LINUX_IMX_SRC ?= "git://github.com/nxp-imx/linux-imx.git;protocol=https;branch=${SRCBRANCH}"
SRCBRANCH = "next"
LOCALVERSION = "-2.0.0"
SRCREV = "d80e97ae9889b097288d58a5455bc4173f3c9648"

inherit module

EXTRA_OEMAKE += "CONFIG_MXC_GPU_VIV=m"

KERNEL_MODULE_AUTOLOAD = "galcore"
COMPATIBLE_MACHINE = "(imx-nxp-bsp)"
