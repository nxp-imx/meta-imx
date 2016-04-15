# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "ae5706e48903e1ff66c5106e80f4cf9e"
SRC_URI[sha256sum] = "1cdc0e13d5d3682da3bdcbd27a8d070d1a8c42922f1ac573a3b92494141b6e2e"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
