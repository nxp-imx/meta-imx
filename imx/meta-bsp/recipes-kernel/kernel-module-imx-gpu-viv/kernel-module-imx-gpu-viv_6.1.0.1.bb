# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "e7d24410af2e1ca988323bfb9471d84e"
SRC_URI[sha256sum] = "798966068ebe53e0dc67a874f0d167db8516e859338a2138b550ae33208fbaf8"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
