# Copyright (C) 2015-2016 Freescale Semiconductor
# Copyright 2017-2018 NXP

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use a newer graphics release with an older kernel."

SRC_URI_append = \
    ";subpath=drivers/mxc/gpu-viv;destsuffix=git/src \
    file://Add-makefile.patch \
"

inherit module
require recipes-kernel/linux/linux-imx-src.inc
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

EXTRA_OEMAKE += "CONFIG_MXC_GPU_VIV=m"

KERNEL_MODULE_AUTOLOAD = "galcore"
