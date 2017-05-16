# Copyright (C) 2015-2016 Freescale Semiconductor
# Copyright 2017 NXP

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cb96128ad72bce490b4c50da2cb1fa42"
SRC_URI[sha256sum] = "4c0b991b90a9f9a9927bec302525392c796f41af616d4db58c764ff86b12f56c"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
