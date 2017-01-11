# Copyright (C) 2015-2016 Freescale Semiconductor
# Copyright 2017 NXP

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "dcbf0c4924f14aa3e578683027d16742"
SRC_URI[sha256sum] = "57bc57136ba6583b4c489d4120e39c38adeaac6a7ff1be777a7cecc5a183cf7c"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
