# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "405dbbd57d302089abbd3d562bf7fec9"
SRC_URI[sha256sum] = "3504b29ed8bbdc600f00c873d4c161fa32b9a65f40269b815f8d20ba2121185b"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
