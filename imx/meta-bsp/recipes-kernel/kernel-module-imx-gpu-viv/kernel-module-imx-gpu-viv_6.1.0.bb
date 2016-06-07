# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "29116df818fe7a1c40f67ce7b0362a19"
SRC_URI[sha256sum] = "f8775b1cfb8fffbeccd28d3cb69ebd767a280efc4d40b3943da288a2abe4d9ec"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
