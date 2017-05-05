# Copyright (C) 2015-2016 Freescale Semiconductor
# Copyright 2017 NXP

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "99feae0ee28f19dacd11a1953b0fce93"
SRC_URI[sha256sum] = "60cb7d6539e476dd5d2f8fe3178b386f4b84c0587b8ce34b1176b5b31aef2d0f"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
