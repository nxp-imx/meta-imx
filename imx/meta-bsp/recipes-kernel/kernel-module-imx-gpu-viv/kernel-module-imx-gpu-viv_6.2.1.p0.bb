# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "022e7def84444cb14bc6eb1da680b720"
SRC_URI[sha256sum] = "fa3169bf77738ac22ac60fd0489d183aa9c40da751e69b9c3ec2150f59aae7d7"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
