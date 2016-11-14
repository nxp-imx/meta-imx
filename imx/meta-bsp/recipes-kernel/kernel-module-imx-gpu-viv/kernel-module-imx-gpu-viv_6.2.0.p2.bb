# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "bb851e46b4ea1c0ecd364c1f38cec150"
SRC_URI[sha256sum] = "c1e2b32bf247b395dd9f520847c9280714f4bd5cf244d421ef455429b0a51648"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
