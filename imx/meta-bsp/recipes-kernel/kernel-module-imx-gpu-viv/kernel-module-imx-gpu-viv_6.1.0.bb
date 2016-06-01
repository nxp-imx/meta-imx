# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "cb1fcd5bbe6f4a48438bce4614b60191"
SRC_URI[sha256sum] = "b72cc0babfc4dac32e28d21850374f98cb65bcb7751913cbf9c876422d67e08f"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
