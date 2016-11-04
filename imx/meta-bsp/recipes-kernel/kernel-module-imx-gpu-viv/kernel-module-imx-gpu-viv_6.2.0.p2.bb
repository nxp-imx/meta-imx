# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "9bbb489ce0d1b063ab982791e2fcc2a2"
SRC_URI[sha256sum] = "1f6ce4cf1542cd385bc9ac5e6430a19b88c2dcb9bd74e34de44a939a12bd329f"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
