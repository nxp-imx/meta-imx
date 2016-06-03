# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "36f55b5803d26001626fbb94e2a358f4"
SRC_URI[sha256sum] = "4568f6ce090019614e41f8e411170e72cd34bd9edf878e50efd9561994cbc473"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
