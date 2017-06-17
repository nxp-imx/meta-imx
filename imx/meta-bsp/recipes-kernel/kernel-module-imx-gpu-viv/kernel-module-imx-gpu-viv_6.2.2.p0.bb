# Copyright (C) 2015-2016 Freescale Semiconductor
# Copyright 2017 NXP

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "382c9c3579720d16d334e5e2a0e7bbbf"
SRC_URI[sha256sum] = "f5c5d8d02d93f62d732f43cbe816c5e4c882e658a3bd56196340e4dcdf10eef0"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
