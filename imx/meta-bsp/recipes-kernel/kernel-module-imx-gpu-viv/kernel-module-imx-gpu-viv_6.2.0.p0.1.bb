# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "66287ceee0f0d96a0d61461ba3cae931"
SRC_URI[sha256sum] = "3b614f9eaeeb77ec26c2f4cba7fa203cfc09bab94066174b1373f8979525bf9e"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
