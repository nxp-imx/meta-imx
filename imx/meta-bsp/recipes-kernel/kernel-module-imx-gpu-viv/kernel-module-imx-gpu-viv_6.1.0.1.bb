# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "11ea1279955e61b30d050e14b39385f3"
SRC_URI[sha256sum] = "8af15a0840d3edbd085e102145ed57c15e7b09fde629f86a17c7e6d670abf431"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
