# Copyright (C) 2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ec1bcb922e86e4b6ccb2bddc3684763c"
SRC_URI[sha256sum] = "773b216d77e96509aed944f365fd01086440942551ac0a4a1bf09225de281f1b"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
