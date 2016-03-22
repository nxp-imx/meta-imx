# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a6f073d1e9ab7ecf14b94aa4e1cf3654"
SRC_URI[sha256sum] = "a6f61aa5f5c45ae22e30b1d2679731efd5f0c54ab4aa33f094f85786931b523a"

inherit module

DEPENDS = "virtual/kernel"

KERNEL_MODULE_AUTOLOAD = "galcore"
