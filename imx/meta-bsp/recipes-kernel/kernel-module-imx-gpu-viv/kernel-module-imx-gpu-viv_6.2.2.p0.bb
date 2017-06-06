# Copyright (C) 2015-2016 Freescale Semiconductor
# Copyright 2017 NXP

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ddc59edfe819f577647156d423fe9982"
SRC_URI[sha256sum] = "9ee815f629c3d69165b3d3e203acb2ef5ab412b293b8ad7d1a55c3dff085ba36"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
