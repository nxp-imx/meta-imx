# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "1d9c220ddcb2789758a361d89821ff73"
SRC_URI[sha256sum] = "3fec74d10eabfc982e98ac991677211d65e5849f70b744ee8cec402723969e6e"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
