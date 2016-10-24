# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "959873f1b75b4be6bee86caba815c9ad"
SRC_URI[sha256sum] = "b609403fe90bf0cd1444e37ae69f231a8580bb65e345722bea9c135d0daa0c17"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
