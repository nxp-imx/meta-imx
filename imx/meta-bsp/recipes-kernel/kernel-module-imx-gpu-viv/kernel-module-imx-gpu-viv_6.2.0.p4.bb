# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "3c6a26bb3be03c09707781fdc9f0efe7"
SRC_URI[sha256sum] = "d1acdd261d867000c032d8f5f2ce9edfa6018ed7c5e1eb07c8b4357305d3571e"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
