# Copyright (C) 2015-2016 Freescale Semiconductor
# Copyright 2017 NXP

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e813b5916fe13a8cc800295611ccb9de"
SRC_URI[sha256sum] = "3c11a0ae03b740e2225d5d4c6ed1dfdc10b3b793cddd0a4b738a4f236c8c7e29"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
