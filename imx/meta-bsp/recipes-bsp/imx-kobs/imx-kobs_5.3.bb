# Copyright (C) 2013-2015 Freescale Semiconductor

SUMMARY = "Nand boot write source"
SECTION = "base"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=393a5ca445f6965873eca0259a17f833"

SRC_URI = "${FSL_MIRROR}/imx-kobs-${PV}.tar.gz"

SRC_URI[md5sum] = "233a12b91154a610e4e75a4fdeaea480"
SRC_URI[sha256sum] = "2eff6be7470e23be2eaa6310a0d24baa88e8536b58a9736cbd246d5b51944001"

inherit  autotools pkgconfig

COMPATIBLE_MACHINE = "(imx)"
