# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "c8b02e452bcf11ba77182642d3e8c40e"
SRC_URI[sha256sum] = "849c91d28955cbf031e109671deae3ffa85e5d0fd8639169de4f7474b813fb42"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
