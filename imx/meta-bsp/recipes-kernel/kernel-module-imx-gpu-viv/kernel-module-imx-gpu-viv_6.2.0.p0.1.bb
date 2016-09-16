# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "e36f643f56378da6ba2fa4237af538b0"
SRC_URI[sha256sum] = "9b36977c86a67efbe7c23421da19cac2003af2d14ba78a03ea6b75d3eb343092"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
