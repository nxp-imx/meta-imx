# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f6ce74f53ca05e214f5defd0735f3061"
SRC_URI[sha256sum] = "aa3cac76ff76649d06421de0de1b8f765f652fcc38f3668e1fdc8e5461b077f3"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
