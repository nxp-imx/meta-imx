# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "d5bf1a6bf018861c2a2c0696ca5399e7"
SRC_URI[sha256sum] = "241583172eed837eb115196a1dbc35cc249f17fc940361132dc13d66a98f4d25"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
