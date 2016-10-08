# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "15c4dc4caa1619d985172df9d9e02c0d"
SRC_URI[sha256sum] = "b771ced12ea033a5298fe9dd65da4eafa9acc600116bbeaf92e03b7ce9e11b50"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
