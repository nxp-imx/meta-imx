# Copyright (C) 2015-2016 Freescale Semiconductor
# Copyright 2017 NXP

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e17ca085dabe03fc4a6ca223be48b8cd"
SRC_URI[sha256sum] = "72c4a89b4353dfbd98f3edc51a5abe9c80ad4e74d46c11b6a44f9e5b2852879b"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
