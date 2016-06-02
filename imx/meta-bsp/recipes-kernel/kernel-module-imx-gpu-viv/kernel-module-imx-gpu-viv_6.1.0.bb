# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "44ddd4163d8ad608c050cd6fe96c8275"
SRC_URI[sha256sum] = "3478b90951450aeae26130fbf8257e0ba97d2fde8eb545ff965c307e4da485ee"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
