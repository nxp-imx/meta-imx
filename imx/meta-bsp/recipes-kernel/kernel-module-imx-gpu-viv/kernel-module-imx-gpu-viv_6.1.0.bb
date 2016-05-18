# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "6514bbcbf403810b21204378c53789e5"
SRC_URI[sha256sum] = "4ef940adaa03bee0a6c2665a9d23cf53fdacf1d9e6be74bbf45216dada4f08e8"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
