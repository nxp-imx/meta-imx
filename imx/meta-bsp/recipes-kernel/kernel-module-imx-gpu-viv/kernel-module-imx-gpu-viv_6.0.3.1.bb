# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "58f87bcae9124fb83fa4f4af6c2bca13"
SRC_URI[sha256sum] = "4386f267f23fa0d8140def1bc25e022a5e214ba56fd78e93f3c0c4e4bb9bef5c"

DEPENDS = "virtual/kernel"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
