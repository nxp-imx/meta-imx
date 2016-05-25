# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "45ea3aebdb429e4c6972ef9dacc06a6d"
SRC_URI[sha256sum] = "c20e95959aacb3a80f1e80d4ae3c0e02f90057c7f43a9d67711a20131e5649ba"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
