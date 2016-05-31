# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "7cf0f3a1864b21e414b8e4b8c1cfbfb5"
SRC_URI[sha256sum] = "2272d6a3f2c21317af58683e3b7dede8e5ae1c5c26d6db03a2c4af776976caea"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
