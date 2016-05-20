# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "87cbffc8272fbaca448a1e5d5d28ef02"
SRC_URI[sha256sum] = "5f0463a76a604a449940edaf078ae7c859d4b23faa1b8d6605bd1653b8879a96"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
