# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "083c91a1e59425e95a984345c9ff057b"
SRC_URI[sha256sum] = "13106cbb320c11fdba3ce3403da6c26db5da05fb9c3b5ac138f841ab26babe2a"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
