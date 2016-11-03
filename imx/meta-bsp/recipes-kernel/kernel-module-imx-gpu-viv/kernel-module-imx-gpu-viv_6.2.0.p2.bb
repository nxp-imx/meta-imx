# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "dfd567ce2ac8ad7cd21e9b68645e8796"
SRC_URI[sha256sum] = "467f3a630a25df08f909e451c3994652b0b31e37249f3f7227a835b84d2a0d14"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
