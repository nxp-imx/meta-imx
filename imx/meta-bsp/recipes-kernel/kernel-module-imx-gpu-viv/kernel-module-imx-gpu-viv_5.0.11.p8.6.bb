# Copyright (C) 2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "38ff1ae735119b733c504831fc117661"
SRC_URI[sha256sum] = "8ec019b5fa8a8d1a86edfbca6ab85d6fc4cb0e8368d1f931facab269c0cd2987"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
