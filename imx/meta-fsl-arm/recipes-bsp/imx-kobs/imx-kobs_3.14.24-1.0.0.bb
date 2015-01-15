# Copyright (C) 2013, 2014 Freescale Semiconductor

SUMMARY = "Nand boot write source"
SECTION = "base"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=393a5ca445f6965873eca0259a17f833"

SRC_URI = "${FSL_MIRROR}/imx-kobs-${PV}.tar.gz"

SRC_URI[md5sum] = "ad07be232f299e9dc2aa1ed466bd77d8"
SRC_URI[sha256sum] = "ac951abc8d0665b8d4726c717cfbfece7f93240fc1f58a03ddada80539120adf"

inherit  autotools pkgconfig
