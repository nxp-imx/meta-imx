# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "7807c4bc61676449276b6b2c541f8d7a"
SRC_URI[sha256sum] = "de803322e594f26e37bed1254b0cc323ad4a7b1cc71ccf35ea607038bb54a924"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
