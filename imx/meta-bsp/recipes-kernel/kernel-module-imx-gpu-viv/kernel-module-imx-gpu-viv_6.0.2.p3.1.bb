# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "12a8e8bd99c99cf6b4a4dac62dcdbd16"
SRC_URI[sha256sum] = "bb934eb60a85eca7aedf7b55e9c4ec01d2718fe6ce0df995c985096b5412a5a8"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
