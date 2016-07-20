# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "00c1983ba2e662cf0520808815665ae0"
SRC_URI[sha256sum] = "598de6d57d7b29d90838e5d82014605c89adf9a797831f2ed5721cea20811fc6"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
