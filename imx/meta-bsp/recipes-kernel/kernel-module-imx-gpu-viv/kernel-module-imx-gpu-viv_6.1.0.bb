# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "a6e34d2ca68374d4b0dbd8996855e06b"
SRC_URI[sha256sum] = "933937a19e8da54d6d316584c6f19819d13147556b400c9792d61c94448bb3ae"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
