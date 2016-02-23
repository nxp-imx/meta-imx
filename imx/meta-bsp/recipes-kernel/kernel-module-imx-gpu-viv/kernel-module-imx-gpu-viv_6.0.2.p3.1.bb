# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d97536c44beea7e8bdbb3eaff6368de4"
SRC_URI[sha256sum] = "db3eab39b9d384fc21184652396f87f67aa3fd2da07c0bed6cd2b7e059b0850b"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
