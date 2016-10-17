# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "e03ab81663a5d66e6df5a48759dc071d"
SRC_URI[sha256sum] = "99989204462255a2d588286fa25b64e20e42d2ace5bbc16153133a4e8dda79ef"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
