# Copyright (C) 2015-2016 Freescale Semiconductor
# Copyright 2017 NXP

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "70f0cfa8316b0ae253be09015135b635"
SRC_URI[sha256sum] = "a8b05a75f672bc35fcebfcfea89f3b4695e7f7f7e5872f898181cf1ab012914c"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
