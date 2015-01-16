# Copyright (C) 2013, 2014 Freescale Semiconductor

SUMMARY = "Nand boot write source"
SECTION = "base"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=393a5ca445f6965873eca0259a17f833"

SRC_URI = "${FSL_MIRROR}/imx-kobs-${PV}.tar.gz"

SRC_URI[md5sum] = "132ae07c04b923422bfda0c5f0762820"
SRC_URI[sha256sum] = "b36e6d5a9e4d9debc1a9b4d0e4762faf8c1d94ec20334bf4a13c23e6d43716fe"

inherit  autotools pkgconfig
