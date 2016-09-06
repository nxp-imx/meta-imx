# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "a9525b5457ee14c5be16f941b3d67ffc"
SRC_URI[sha256sum] = "f2ea3cf28ae7efbe35946c2c1978b110c6ae7cdaa5dd48ebc12a83e572e57139"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
