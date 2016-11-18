# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "7e3b8623e82e2df8a9e061bb40491ae2"
SRC_URI[sha256sum] = "c94d51a32b911eb5c8bb4ee83b93efff5b66c584000ce988f2346b999f3bbd69"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
