# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "c386ec90f110c094475cf68c16ef991e"
SRC_URI[sha256sum] = "9f61299a2a18a07c7dffe6496b2ca8631ef974e542bd10ac037607ed783dd784"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
