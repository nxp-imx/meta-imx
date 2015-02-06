# Copyright (C) 2013, 2014 Freescale Semiconductor

SUMMARY = "Nand boot write source"
SECTION = "base"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=393a5ca445f6965873eca0259a17f833"

SRC_URI = "${FSL_MIRROR}/imx-kobs-${PV}.tar.gz"

SRC_URI[md5sum] = "83f650d3fe04b69ec157f04d45fea15b"
SRC_URI[sha256sum] = "a541119100273729d53ea2ef5f076e84f7e852b914bb79c05479f13029e4cc8f"

inherit  autotools pkgconfig
