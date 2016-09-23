# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "d91dfdda4e753befe4b7084e439402ae"
SRC_URI[sha256sum] = "92f85c46888eab6bd24a6368635e0efc3757f1778c85f82f878568ba91f08b45"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
