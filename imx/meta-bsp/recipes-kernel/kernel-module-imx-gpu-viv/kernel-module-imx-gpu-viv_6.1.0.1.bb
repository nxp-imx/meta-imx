# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "d7a8e26238e8995b5e6ad7c64452a954"
SRC_URI[sha256sum] = "59ccd443893575d3dece520543c867fe1e7e57a4a3d21e5febc9dbffa5a070b3"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
