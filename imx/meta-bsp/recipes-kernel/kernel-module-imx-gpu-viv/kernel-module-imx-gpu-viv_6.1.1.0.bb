# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "34c29907b2059e89cf1f4ed1098d7fbc"
SRC_URI[sha256sum] = "3ca61bba69945cc0b60048307ec9db0bea0ffed03d247aec47d90b5e219714ab"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
