# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "1e60dfd162bb5399fac7f0a241168c28"
SRC_URI[sha256sum] = "05bdc2f68e92e277939eb8f65ef323d246aaf42fc45b1309e1ac5f2be139bd21"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
