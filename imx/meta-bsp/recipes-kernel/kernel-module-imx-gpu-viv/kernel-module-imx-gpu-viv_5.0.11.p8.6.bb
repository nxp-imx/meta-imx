# Copyright (C) 2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9c6153806f19bdd16a7923d5fed218ce"
SRC_URI[sha256sum] = "6ba8ab2654698a707e93daa88eb8bae7c2708820b525716b1bdf092539973693"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
