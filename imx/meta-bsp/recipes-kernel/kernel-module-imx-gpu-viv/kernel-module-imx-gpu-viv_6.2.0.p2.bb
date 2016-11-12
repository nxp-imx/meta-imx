# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "50c32abd8e16ac910f5e792524250b46"
SRC_URI[sha256sum] = "92b71b9d1a8843cd16032f4adb2047f1ed64b3f965b2503f44eda3d1056e1961"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
