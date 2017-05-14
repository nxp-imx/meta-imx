# Copyright (C) 2015-2016 Freescale Semiconductor
# Copyright 2017 NXP

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9e3bff5aa3a511106ac06f8334d8e1f0"
SRC_URI[sha256sum] = "fe42503275cf1dcd0b40627729b3482ae4ddd603e75b85ef3f62925b1e688ce6"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
