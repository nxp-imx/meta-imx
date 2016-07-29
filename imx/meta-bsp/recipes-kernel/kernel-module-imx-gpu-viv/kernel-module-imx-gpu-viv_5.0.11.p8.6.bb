# Copyright (C) 2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "522bda8d2917cea5d3525323af427185"
SRC_URI[sha256sum] = "db2fad2b29ed57fe15a5194d0ea4e1d499f853b85a109d3f2c03eaa63f293415"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
