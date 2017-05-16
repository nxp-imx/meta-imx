# Copyright (C) 2015-2016 Freescale Semiconductor
# Copyright 2017 NXP

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e4ae0ae42f94ef816f7bdf4edf2a9f78"
SRC_URI[sha256sum] = "6fa9ffe61e10488a0a76cf16ddd57d424126122826c7b78d28f349f0b669094b"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
