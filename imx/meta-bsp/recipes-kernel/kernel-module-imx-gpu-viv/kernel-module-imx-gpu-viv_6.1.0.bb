# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "b322e602edee31836b4cad45987718ab"
SRC_URI[sha256sum] = "a1c7800c2f420f6835e29861ce52d230dea65b538e5a1cdd7a70bbf5a294147c"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
