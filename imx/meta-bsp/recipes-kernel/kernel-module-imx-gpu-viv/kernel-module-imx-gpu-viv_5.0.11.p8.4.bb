# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d175dce46ca9c436e3b852444f68c92c"
SRC_URI[sha256sum] = "d5a70247d1a2243cdf7feb1209c05d703e08aaee83b4ba2715bd8dbbe9567aca"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
