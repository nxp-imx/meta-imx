# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "fa66b3352a24087739ec96cdacc3c412"
SRC_URI[sha256sum] = "8681416f18d1f113bed1697b765c9dfa9936d0964d2c3e36dc5cb6abbdd7c9b8"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
