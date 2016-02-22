# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "06bced55cb13dd8573489e721a6a96fc"
SRC_URI[sha256sum] = "445e95aa04e253c82ebba195bb1d7ab86c6d6519f23bc2d62c1fe57afdca95b4"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
