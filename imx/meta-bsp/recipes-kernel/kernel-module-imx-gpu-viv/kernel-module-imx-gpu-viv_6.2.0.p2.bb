# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "00b7dd68348b21820d778d02cfa75665"
SRC_URI[sha256sum] = "7cf9801e0d5da7dcb3a8cafeea7621ea083a3cc0187a51bbcf3d64e992459db8"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
