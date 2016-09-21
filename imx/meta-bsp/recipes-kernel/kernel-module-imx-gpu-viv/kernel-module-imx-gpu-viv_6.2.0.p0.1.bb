# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "b258d54835b2d77f56b8fdb67ab586da"
SRC_URI[sha256sum] = "37f8e2870cf7bb7489c5d21d03b6e4d026ff79b3f521ba49a73031d8e35afd0b"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
