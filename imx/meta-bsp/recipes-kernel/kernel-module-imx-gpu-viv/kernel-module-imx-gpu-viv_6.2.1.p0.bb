# Copyright (C) 2015-2016 Freescale Semiconductor
# Copyright 2017 NXP

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "ce58e0b11b45f85ea20a82fe48b9a99f"
SRC_URI[sha256sum] = "f6c547df0334cd5867b398e958f05f0b22c19c7ba8d895b7b02d27d868374704"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
