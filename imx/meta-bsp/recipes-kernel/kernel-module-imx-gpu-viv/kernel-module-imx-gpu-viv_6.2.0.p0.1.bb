# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "7c18d820426963cde3fe150f31a0533a"
SRC_URI[sha256sum] = "9d9d536a98bbaaf126a01ecdf7df2a04e3cfd12bff55ae4cc65b86e5bd7ac1fa"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
