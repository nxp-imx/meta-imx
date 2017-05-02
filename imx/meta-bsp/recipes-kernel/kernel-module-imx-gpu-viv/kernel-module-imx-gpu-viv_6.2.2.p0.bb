# Copyright (C) 2015-2016 Freescale Semiconductor
# Copyright 2017 NXP

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3b3adba15c2d5477a3fc537278a4185a"
SRC_URI[sha256sum] = "e5f8f164602a63b2a2e0081d428c3aff98c633a2a01b7e359d92511fd28c6c3c"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
