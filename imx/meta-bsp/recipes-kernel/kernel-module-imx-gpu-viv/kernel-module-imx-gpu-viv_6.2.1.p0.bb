# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "f9f2c111545ccf0958a6dd4cb84d6e9e"
SRC_URI[sha256sum] = "ec7fe6c42e5572c17f4c1d4eab19860e6e0e24a52d0f348754ac7dd66b746e5c"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
