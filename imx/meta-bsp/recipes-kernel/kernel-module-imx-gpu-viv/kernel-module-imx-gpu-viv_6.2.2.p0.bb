# Copyright (C) 2015-2016 Freescale Semiconductor
# Copyright 2017 NXP

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6d4ee5b0ac48754c940f8008a8616b7e"
SRC_URI[sha256sum] = "e9fd09c51ff7a4b31681efa548d92c74a7b54b60a762ed63805b9dbeae3870fd"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
