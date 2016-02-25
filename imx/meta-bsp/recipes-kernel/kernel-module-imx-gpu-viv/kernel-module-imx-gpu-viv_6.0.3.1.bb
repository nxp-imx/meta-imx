# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ec8c6ea1b382b1d8bf333bfcdbdbff7d"
SRC_URI[sha256sum] = "e59e9f6260bee2d084aa3feffd8f3cdd300c210d553fb0a48dfa6c8153f062da"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
