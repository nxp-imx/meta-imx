# Copyright (C) 2015-2016 Freescale Semiconductor
# Copyright 2017 NXP

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1dfef2bae78e9a58f1f56d3c2de15e8f"
SRC_URI[sha256sum] = "61335b9e9150a47da5d2cc18bc9f66fd5658cc5d686aca1dda3c111440e62552"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
