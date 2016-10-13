# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "52fa037464039e51cf86eb2dcc1a5180"
SRC_URI[sha256sum] = "5b1650d0a96a6b386f21fbaa892acc6a78e04f4e5bf49931045b1a35105469cf"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
