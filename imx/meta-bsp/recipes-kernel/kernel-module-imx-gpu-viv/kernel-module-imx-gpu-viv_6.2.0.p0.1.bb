# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "a002c1056dbb70052381f7e68e457bf8"
SRC_URI[sha256sum] = "412e0271e13b5723663e136265454c54bdfbe26092f7113d9bf802c1abe081f4"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
