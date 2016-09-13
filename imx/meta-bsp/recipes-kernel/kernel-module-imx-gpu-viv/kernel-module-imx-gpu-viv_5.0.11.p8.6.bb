# Copyright (C) 2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b203033ee3f13f4ad4b279e39a6c94e8"
SRC_URI[sha256sum] = "fb61bb0da800ea52668080f44ea758e4082befd7d7a54159677bd7fe0d755d83"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
