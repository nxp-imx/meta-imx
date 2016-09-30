# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "a678fde25639cf6c88e1f78a2e20b72e"
SRC_URI[sha256sum] = "664eac4ec0987aa50b8697355d910c786aaed8876c83b61e75248364e3adaaaa"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
