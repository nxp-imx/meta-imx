# Copyright (C) 2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cf18570d07f7012d808369d4d19406de"
SRC_URI[sha256sum] = "6d355344d0e948b8493033ea200e393b242f4c8413ddf32f51aad999137572bc"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
