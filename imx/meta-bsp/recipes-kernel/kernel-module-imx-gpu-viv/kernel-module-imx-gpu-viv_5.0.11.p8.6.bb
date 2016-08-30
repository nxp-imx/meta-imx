# Copyright (C) 2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c340c668fb5c481ce261e4bea1e2e948"
SRC_URI[sha256sum] = "94cfcd1064c3d11410308349f9a48bcbfab38d9bd7dcca8ca8afffec5cde92d7"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
