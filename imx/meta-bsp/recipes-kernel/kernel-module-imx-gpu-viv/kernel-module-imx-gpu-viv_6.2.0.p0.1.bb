# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "b5d88c83a6ee54cbf3c24d30dee10aec"
SRC_URI[sha256sum] = "3d9fc8210cbf542e49c81653e701d367cd602913bdf86293f7a772639ac40b1b"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
