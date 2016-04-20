# Copyright (C) 2013-2016 Freescale Semiconductor

SUMMARY = "Nand boot write source"
SECTION = "base"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=393a5ca445f6965873eca0259a17f833"

SRC_URI = "${FSL_MIRROR}/imx-kobs-${PV}.tar.gz"

SRC_URI[md5sum] = "48ed9e69e9527d2e98b5cfcbf133d75b"
SRC_URI[sha256sum] = "57faac9ce124f08dafc16501f229ef954994daa08eda11db9c23c4983055da90"

inherit  autotools pkgconfig

COMPATIBLE_MACHINE = "(imx)"
