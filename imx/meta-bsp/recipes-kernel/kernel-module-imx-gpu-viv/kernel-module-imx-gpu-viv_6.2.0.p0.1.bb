# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "aba534ec19981212d00a012dfdf198d4"
SRC_URI[sha256sum] = "ce9b8fd5c6c0242abe6686863864291035eaf729177d8a2fb4a8d0889e63f8f4"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
