# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "c274ebe7c563f0967e54661ced706599"
SRC_URI[sha256sum] = "68487bf3760a1741fde0299a3243d7a4f056f8b57c28d49ab94b9b48688b36c5"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
