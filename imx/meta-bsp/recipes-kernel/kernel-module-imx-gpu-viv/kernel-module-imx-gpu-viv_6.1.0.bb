# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "65bb67a1b2633a4ddb1e9cccf9cc40fe"
SRC_URI[sha256sum] = "15e5c86cf45f8fdd06170612f98f04d755269e12ab7a909371d02a566099f08b"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
