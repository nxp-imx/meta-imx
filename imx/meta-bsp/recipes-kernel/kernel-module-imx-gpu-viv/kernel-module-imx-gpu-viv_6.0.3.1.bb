# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "18b30af6c7034826ea5b1aa11b96aa40"
SRC_URI[sha256sum] = "4fec50a27b5377e0104933e4f2318ad22331d6eebddaed158ac9207f4cb44ed7"

DEPENDS = "virtual/kernel"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
