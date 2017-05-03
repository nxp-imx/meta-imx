# Copyright (C) 2015-2016 Freescale Semiconductor
# Copyright 2017 NXP

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6909aeeb35934896a5a221bb8e4e6aa6"
SRC_URI[sha256sum] = "201bbf1afd7b1357c90172cf15b9abbf863f5633b977dcb1bbd6ff725a6ebd4b"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
