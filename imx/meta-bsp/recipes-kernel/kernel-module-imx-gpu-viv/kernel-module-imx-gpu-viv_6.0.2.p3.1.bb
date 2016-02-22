# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "62d74fd528bcf0a1ccca0efaefcd6a03"
SRC_URI[sha256sum] = "0c94d97dff08a7dac032adf76a6af62f9ad17d26b4240a2a6855729dbad2cb5c"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
