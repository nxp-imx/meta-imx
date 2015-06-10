# Copyright (C) 2013-2015 Freescale Semiconductor

SUMMARY = "Nand boot write source"
SECTION = "base"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=393a5ca445f6965873eca0259a17f833"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"

SRC_URI[md5sum] = "39a98dd67af84bd31c0ce82aef0b1e21"
SRC_URI[sha256sum] = "3b8c5b9d59633f689b9034149be490aa84a783cf05ec6714a982559bb5ccd974"

inherit  autotools pkgconfig

COMPATIBLE_MACHINE = "(mxs|mx6|mx7)"
