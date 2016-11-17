# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "61f2cc8e6b92b5f11279c3574dbda351"
SRC_URI[sha256sum] = "1e388ea1042797d9291224e97c57af8fe14cbe196501c130825ae594f029c8d5"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
