# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "184faacbeab81231ed8b7396fd95ccb5"
SRC_URI[sha256sum] = "d363e29e9194fcbac970f579dbab5e2dedb1f253dd6a7660d637ce31f2f44e66"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
