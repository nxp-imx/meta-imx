# Copyright (C) 2015 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

inherit module

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4b66e671ea1598a0e9605c10b0266a78"
SRC_URI[sha256sum] = "b36824de97aea3e22b857ddd1d39e84d420b7e3eec047c452759949c1bd96058"
