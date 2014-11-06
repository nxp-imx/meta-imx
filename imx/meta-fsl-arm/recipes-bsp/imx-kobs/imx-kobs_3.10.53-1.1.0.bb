# Copyright (C) 2013, 2014 Freescale Semiconductor

SUMMARY = "Nand boot write source"
SECTION = "base"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=393a5ca445f6965873eca0259a17f833"

SRC_URI = "${FSL_MIRROR}/imx-kobs-${PV}.tar.gz"

SRC_URI[md5sum] = "a61f5dcd240e197d7e40227a7727eafe"
SRC_URI[sha256sum] = "4036eaccdff9ba549fa66980b8804ec3f5c3d13443d6ac15f17428addf6bd4ce"

inherit  autotools pkgconfig
