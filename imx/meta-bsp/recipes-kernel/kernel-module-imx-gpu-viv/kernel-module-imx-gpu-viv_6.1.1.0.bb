# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "3cec20133c67fdb9b99f6ab34d3c7361"
SRC_URI[sha256sum] = "0a3c967af4908b17111f76a16ddeb780b50d7424b48930e785bd370b0f4de861"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
