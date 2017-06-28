# Copyright (C) 2015-2016 Freescale Semiconductor
# Copyright 2017 NXP

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "15b97f13279bdd97aea15ebe5a8b8bff"
SRC_URI[sha256sum] = "f43bb41fb4bab84666207954dffba56edc99b2dde55eea54601e040c26f98cd8"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
