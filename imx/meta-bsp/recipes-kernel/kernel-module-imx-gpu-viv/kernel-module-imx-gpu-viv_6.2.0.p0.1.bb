# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "3d941792432754deeb0ae44eb9c58807"
SRC_URI[sha256sum] = "ce74ec0f2a2cb9f8aab32229d935120e90dbf197a6728b1e2f4b3967f4b3cbff"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
