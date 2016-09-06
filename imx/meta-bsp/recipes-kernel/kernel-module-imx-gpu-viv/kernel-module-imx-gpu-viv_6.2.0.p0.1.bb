# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "296d186ed3b1223c1116ce5ccc4ba401"
SRC_URI[sha256sum] = "2cd2c4c567355724f7b8791a4cefd6bfaf7435f07a528e1d2a99a6e946fb0130"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
