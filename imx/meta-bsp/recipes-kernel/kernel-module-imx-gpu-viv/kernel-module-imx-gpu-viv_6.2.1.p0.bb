# Copyright (C) 2015-2016 Freescale Semiconductor
# Copyright 2017 NXP

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "8b997c5923f7e89bc09408da54531980"
SRC_URI[sha256sum] = "86c7e85e9e61eac4990a2b15f8d6d1d13190bcf9cef33ad935190a838f3d671d"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
