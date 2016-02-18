# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c3214ceb3da3d97a5ec18ed8faeaf5a9"
SRC_URI[sha256sum] = "35451acf61653e9089712fcb6ecc78e9cc37cd89de53e559dd975d6b00e0c1a4"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
