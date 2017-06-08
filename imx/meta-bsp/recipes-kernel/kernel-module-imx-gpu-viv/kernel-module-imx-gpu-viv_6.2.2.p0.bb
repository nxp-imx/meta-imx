# Copyright (C) 2015-2016 Freescale Semiconductor
# Copyright 2017 NXP

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "653fd211003e54f1a2573c7c37347ce0"
SRC_URI[sha256sum] = "0b52819c6d18f69e04944b7ce7d9d4feb7ada9c43e658f41f5683d82687fdaf8"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
