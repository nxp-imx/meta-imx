# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ea6d1ce96379a446ebf75e397d6a59f6"
SRC_URI[sha256sum] = "b2ac50f72bcba524d74da73487ce9232248911acbcbd008faabe8fa5ab37beb7"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
