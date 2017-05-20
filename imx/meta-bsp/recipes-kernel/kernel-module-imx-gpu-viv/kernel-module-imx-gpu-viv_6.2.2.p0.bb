# Copyright (C) 2015-2016 Freescale Semiconductor
# Copyright 2017 NXP

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "af2c9a8d9c5ded8e595013fbab88687f"
SRC_URI[sha256sum] = "825aac1ef793baed24ce096528ece9f386ad7d32339914777f27c2bd0bf836a5"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
