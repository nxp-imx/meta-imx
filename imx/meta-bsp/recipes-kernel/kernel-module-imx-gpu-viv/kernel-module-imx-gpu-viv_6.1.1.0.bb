# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "d559d76963396f17afc86db3efb79c79"
SRC_URI[sha256sum] = "d25ff156fe8db8a74474d5effd333c3c05730813ebf1fc4f549d7448e397ff88"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
