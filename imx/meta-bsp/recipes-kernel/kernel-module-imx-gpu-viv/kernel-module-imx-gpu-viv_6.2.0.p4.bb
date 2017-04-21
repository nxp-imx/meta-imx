# Copyright (C) 2015-2016 Freescale Semiconductor
# Copyright 2017 NXP

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "065ea59b3bbc403fb38ec9c538963035"
SRC_URI[sha256sum] = "e0ae0c25588faad6f0136a2adc8ccdd3af780b22471d33c7d2606b6bfb2ac58b"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
