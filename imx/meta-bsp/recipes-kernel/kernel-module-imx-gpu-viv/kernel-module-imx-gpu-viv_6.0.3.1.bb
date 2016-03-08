# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e3625f4ddbe388b196e569f5b928dca8"
SRC_URI[sha256sum] = "10d4936e9ac4c6c9760892933c6e836777d1eb36e83738210143814eccf2f1bb"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
