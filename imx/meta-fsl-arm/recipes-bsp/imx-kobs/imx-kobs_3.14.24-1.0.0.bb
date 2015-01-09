# Copyright (C) 2013, 2014 Freescale Semiconductor

SUMMARY = "Nand boot write source"
SECTION = "base"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=393a5ca445f6965873eca0259a17f833"

SRC_URI = "${FSL_MIRROR}/imx-kobs-${PV}.tar.gz"

SRC_URI[md5sum] = "fdc17f92963576ded10c031834ce6b71"
SRC_URI[sha256sum] = "fccbbc5fcc0fe7bba2a3167552fa3b9547ae72dbb658473858b6254035a9af0e"

inherit  autotools pkgconfig
