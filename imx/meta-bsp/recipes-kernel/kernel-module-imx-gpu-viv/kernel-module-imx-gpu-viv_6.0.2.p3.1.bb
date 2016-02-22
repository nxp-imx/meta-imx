# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "49867d90b2f916dc8ab89314f10d90a9"
SRC_URI[sha256sum] = "50eda399e8ccfcd323662395cc1adb928ffc7ca9af833a9c6876eecef0c9fc3f"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
