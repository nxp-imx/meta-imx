# Copyright (C) 2013, 2014 Freescale Semiconductor

SUMMARY = "Nand boot write source"
SECTION = "base"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=393a5ca445f6965873eca0259a17f833"

SRC_URI = "${FSL_MIRROR}/imx-kobs-${PV}.tar.gz"

SRC_URI[md5sum] = "8556c7d1aa83a6cdb4c3ae2d4e6f8d44"
SRC_URI[sha256sum] = "99a64221318f10e9b3b12e1774478b70dd90d3f946a78b541e119c28d0cf6a53"

inherit  autotools pkgconfig
