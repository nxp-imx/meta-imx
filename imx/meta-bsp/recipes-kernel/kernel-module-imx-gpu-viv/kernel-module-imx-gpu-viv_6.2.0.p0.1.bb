# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "67ac2dc2bd61519161de1864607c4949"
SRC_URI[sha256sum] = "72cf7723f88184847188cb6668a0c3999c304b68becf0d96e4859ebc8a4b0059"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
