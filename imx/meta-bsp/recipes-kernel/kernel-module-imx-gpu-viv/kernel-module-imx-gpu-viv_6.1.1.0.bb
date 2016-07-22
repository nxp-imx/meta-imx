# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "0783102871e64f4d6636e2dcc7017e06"
SRC_URI[sha256sum] = "edb1330fa0349b232aab3c082a6b693c8772953319ca41069bdad7c0aa158315"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
