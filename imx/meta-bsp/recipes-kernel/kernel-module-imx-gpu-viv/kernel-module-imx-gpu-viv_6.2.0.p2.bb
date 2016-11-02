# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "ce13387e66c361a06a7824ebf228b6d8"
SRC_URI[sha256sum] = "d592907f446e007c6ab3826712cfefe8a6a37c16354f1579bb5a4ba449517995"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
