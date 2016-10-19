# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "bed46c896e0e5d99b4f330f0d7a02405"
SRC_URI[sha256sum] = "4b6f08c493bc431edaa588800b0856ef318f13255ffe4954bb42b22996819f60"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
