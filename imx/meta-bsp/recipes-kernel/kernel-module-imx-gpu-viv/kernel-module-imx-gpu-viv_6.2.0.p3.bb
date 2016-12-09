# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "38797da914b40775ca1c7d1ba79ef243"
SRC_URI[sha256sum] = "2d68357d4c35fed907e894a4fb63062eb27b2205590a492493a1098ef76da924"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
