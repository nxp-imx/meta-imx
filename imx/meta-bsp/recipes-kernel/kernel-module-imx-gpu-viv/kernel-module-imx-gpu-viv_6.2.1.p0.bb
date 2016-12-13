# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "f53a3672cb6e56c3aca79ae12e571a10"
SRC_URI[sha256sum] = "cd33050f965238f7f363660e516520649ecc84395a4bf744e7f0ec73b32db9e5"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
