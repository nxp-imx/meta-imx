# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "627791e2b41353cd2b0245bd8e70a055"
SRC_URI[sha256sum] = "d4f6a5b4625a474fbc99696416ed00248044339fc0d33a7ad9ddaf289e65cbee"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
