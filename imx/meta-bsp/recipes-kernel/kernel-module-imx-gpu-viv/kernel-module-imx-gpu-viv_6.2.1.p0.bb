# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "b88658fa1b6830ad9d82c228f1ab3cf1"
SRC_URI[sha256sum] = "73996aa18ae9367e9af1af2ff8d86d3cd01a8452ea295fc29126cfadea56d5e9"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
