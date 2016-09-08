# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "1ed57dc6ea3409642843741db21e6480"
SRC_URI[sha256sum] = "5133e1585fdbffbd3d3c1603607921a6946a2eb2c802bb061c1a80c6d1a6b459"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
