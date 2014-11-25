# Copyright (C) 2013, 2014 Freescale Semiconductor

SUMMARY = "Nand boot write source"
SECTION = "base"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=393a5ca445f6965873eca0259a17f833"

SRC_URI = "${FSL_MIRROR}/imx-kobs-${PV}.tar.gz"

SRC_URI[md5sum] = "3f2bad2d4510125538139302545e3c25"
SRC_URI[sha256sum] = "d59f13306b479d77a55291c6f8ca7983109aa8aad6f4252d87b1d8b7ad772dda"

inherit  autotools pkgconfig
