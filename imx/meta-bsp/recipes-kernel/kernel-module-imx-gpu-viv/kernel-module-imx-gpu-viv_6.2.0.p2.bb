# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "16d5d9d01a8e8116f25e6b5645093ab6"
SRC_URI[sha256sum] = "b4f8df4ef3d123e48852f107f1b0ccdd76bc15c9470b9d4846e7b69e86d7ef9e"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
