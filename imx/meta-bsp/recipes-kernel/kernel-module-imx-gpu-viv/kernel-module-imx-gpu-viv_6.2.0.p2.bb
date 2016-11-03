# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "73512df8f59d43e353bce6052de67275"
SRC_URI[sha256sum] = "f0acb87050344ad8775cb25d3e8ad792a36a74860525692326a9e4e0345a5b30"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
