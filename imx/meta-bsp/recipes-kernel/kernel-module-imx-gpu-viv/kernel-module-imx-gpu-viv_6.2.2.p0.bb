# Copyright (C) 2015-2016 Freescale Semiconductor
# Copyright 2017 NXP

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "38b556411ff143f2bbc49d8f95a31b65"
SRC_URI[sha256sum] = "a433ac724ea3b03474b80e45f397b8bc4cac5241fa052b27d8a721d1e15ed8b2"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
