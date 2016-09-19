# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "d43e0b6e52c240c032c060e8ab1c2d52"
SRC_URI[sha256sum] = "dc1a64dccf4a2f62f0fbacbb48548e4be70f56ad41f9003082d21ac3d45e6955"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
