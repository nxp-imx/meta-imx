# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "402a5e6f5f808ba753b8494566ad9398"
SRC_URI[sha256sum] = "9b1b53ae8f2dc3a1105e20125998015ab17074f6a0be4fedc189cc7552f523c0"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
