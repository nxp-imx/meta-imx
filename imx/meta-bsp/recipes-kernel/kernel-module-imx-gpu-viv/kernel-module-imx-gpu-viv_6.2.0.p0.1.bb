# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "e942be9f739b87d31534f3de8f3749e4"
SRC_URI[sha256sum] = "449ef0e44be4213fd4ef8fa2553b2a6a3e24bdeabad1fb64fe58d1e820c06745"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
