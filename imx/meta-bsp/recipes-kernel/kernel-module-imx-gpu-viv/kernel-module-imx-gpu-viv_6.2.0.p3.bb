# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "aa0744dd465f8a1393b0b7cc57e30fcc"
SRC_URI[sha256sum] = "bd227f0daa5eaae06eea3bbf55b1dfcfaebdade216561ab58fc665e15ee919a3"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
