# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "a7aaa878aec8d8d1221c6060e47bc6d7"
SRC_URI[sha256sum] = "61674ab21eca57c364c32cf85a12f57592a4aa8e6c15b29b2e2eb802e8ba0fe2"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
