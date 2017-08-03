# Copyright (C) 2015-2016 Freescale Semiconductor
# Copyright 2017 NXP

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fd472e1da42a4713ff91c97f31d61f7b"
SRC_URI[sha256sum] = "947c2dc15f3975dce188d763759226dde8b82b98a53edf37a2ef4985613092ac"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
