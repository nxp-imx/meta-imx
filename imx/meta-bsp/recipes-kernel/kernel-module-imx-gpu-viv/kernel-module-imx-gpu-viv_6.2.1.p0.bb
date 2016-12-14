# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "150474308283467f2a5e4c1d6633a690"
SRC_URI[sha256sum] = "09adb1cb8de81d870c869d4706f565afdb13e708a5ce8cd625b45313b5d3491b"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
