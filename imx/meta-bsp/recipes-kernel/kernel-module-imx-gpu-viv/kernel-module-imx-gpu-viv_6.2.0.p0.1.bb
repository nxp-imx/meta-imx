# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "71b0bf93e0633459523f6052890c0831"
SRC_URI[sha256sum] = "fde56886f3c6accef428fca9e9aa5abaccd0e4253c740504f34090085a6c34d3"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
