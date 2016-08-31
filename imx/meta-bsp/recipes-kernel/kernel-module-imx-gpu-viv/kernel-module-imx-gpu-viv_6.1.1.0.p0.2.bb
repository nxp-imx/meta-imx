# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "624f69b2a26ffaf00782fbac8907b250"
SRC_URI[sha256sum] = "5229fca7b067ae52e439f4388f5f3564751a773a32d0d0943219cb7af16cd173"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
