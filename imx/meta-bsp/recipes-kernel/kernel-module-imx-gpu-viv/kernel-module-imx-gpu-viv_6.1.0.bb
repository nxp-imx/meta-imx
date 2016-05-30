# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "f0de26e37411cff94e2953a7bd4c125e"
SRC_URI[sha256sum] = "e260d86bc51472bb096e961d058f4cde2ef91870bbd8712a7265c2116b51619b"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
