# Copyright (C) 2015 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

inherit module

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1f8b454c90fbd8ca152a4ad12fdb8e30"
SRC_URI[sha256sum] = "54375eeef69dc943ae36cd015f257d24e2c9b5b8ae27974605b0a1f3d3831bca"
