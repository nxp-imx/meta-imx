# Copyright (C) 2015-2016 Freescale Semiconductor
# Copyright 2017 NXP

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "06e9de98dfa9ff1eea3dfaa83963c9d0"
SRC_URI[sha256sum] = "d7fbcd4d767a3e2c41fbf6cfcd63f571ea4c1febd69be2b557617846187a1c11"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
