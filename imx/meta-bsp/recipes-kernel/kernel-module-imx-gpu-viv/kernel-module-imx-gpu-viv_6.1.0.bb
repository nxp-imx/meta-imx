# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "387247dbfdc112dd17413fb01b356dfc"
SRC_URI[sha256sum] = "7252ba5ac673996c1e18ae313374a22acf1676ff90b203fad487f2e45fc77860"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
