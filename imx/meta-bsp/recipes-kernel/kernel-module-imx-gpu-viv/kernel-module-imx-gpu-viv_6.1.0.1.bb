# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "4df72e3f3aed06354ac02afa1b4c87d8"
SRC_URI[sha256sum] = "32b7274449743b4a2f46c0896a5551b36ba5c897a770e8a47c2e6bd076e80254"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
