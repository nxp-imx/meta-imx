# Copyright (C) 2015-2016 Freescale Semiconductor
# Copyright 2017 NXP

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "d4ee8e28b47afbfa82b8e58897f23fdf"
SRC_URI[sha256sum] = "2fdca6eacb2177550749f19910d386d56a1fd402d5aa9bcca819a5604745d3d5"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
