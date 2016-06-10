# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "9cd2b74264c820a0a7adaa35d4fe63a9"
SRC_URI[sha256sum] = "6b0d8b4faa201706b657b3489d0a49f040003412786b2d0511be176141be28c3"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
