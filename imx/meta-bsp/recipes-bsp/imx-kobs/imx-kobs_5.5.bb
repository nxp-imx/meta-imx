# Copyright (C) 2013-2016 Freescale Semiconductor

SUMMARY = "Nand boot write source"
SECTION = "base"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=393a5ca445f6965873eca0259a17f833"

SRC_URI = "${FSL_MIRROR}/imx-kobs-${PV}.tar.gz"

SRC_URI[md5sum] = "20b8e6e45593f4b6d8df736ccde8359f"
SRC_URI[sha256sum] = "159e243220b8688d09450c63b84519ea6759173930300fdc926f4704df45b0dc"

inherit  autotools pkgconfig

COMPATIBLE_MACHINE = "(imx)"
