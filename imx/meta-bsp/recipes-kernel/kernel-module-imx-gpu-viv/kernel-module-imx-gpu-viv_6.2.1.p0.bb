# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "5b15ad26e74e6e1a2ecd50e6037f59d4"
SRC_URI[sha256sum] = "f3334c0bea9078ddc621b40387faffcaef2142a8f78a0019c2b1e0ea122eb164"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
