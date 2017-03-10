# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://MakefileModSym.patch \
           file://kbuild.patch"

SRC_URI[md5sum] = "5032cbf5d1fe0798691bdada542299e6"
SRC_URI[sha256sum] = "1bcf47768841bb519ab6f02add1e40ec9969abd488a7b8025cdd4205448b8c17"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
