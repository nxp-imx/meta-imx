# Copyright (C) 2015-2016 Freescale Semiconductor
# Copyright 2017 NXP

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "04a2c9c2b4ff063971ae5e1da8ba4489"
SRC_URI[sha256sum] = "1874fa94f53643cd3b5da7bb5c7bccb70f3c3a4b04842bbd2c80543473b5ea7d"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
