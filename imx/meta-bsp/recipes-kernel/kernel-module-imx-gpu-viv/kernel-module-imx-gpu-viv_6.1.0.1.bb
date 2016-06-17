# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "a295d927a9c61906ebbe94e3ceee3019"
SRC_URI[sha256sum] = "e5ff5f790b894f506dea1f286d0d781316f3080fde1d07086892544b5bcc09a4"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
