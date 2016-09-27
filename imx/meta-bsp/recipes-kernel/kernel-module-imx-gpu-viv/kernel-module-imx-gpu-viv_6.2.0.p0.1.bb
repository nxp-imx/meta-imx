# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "702e8c1871a3847ed095e66646d9e513"
SRC_URI[sha256sum] = "30232b278d1efcdb543197be13a628912ae89cc34b3b14ceb3a2dc8960bc1b11"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
