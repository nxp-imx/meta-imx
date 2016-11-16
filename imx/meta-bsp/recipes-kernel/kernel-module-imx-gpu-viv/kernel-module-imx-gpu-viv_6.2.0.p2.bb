# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "6d2bcbc217a581febd38a3801822639a"
SRC_URI[sha256sum] = "8a3b9bd47a4c37963010442a8bacc895657f51196d645e3cd516d2e1d1cddafa"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
