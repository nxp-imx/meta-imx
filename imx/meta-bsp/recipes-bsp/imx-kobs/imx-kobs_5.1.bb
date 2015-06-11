# Copyright (C) 2013-2015 Freescale Semiconductor

SUMMARY = "Nand boot write source"
SECTION = "base"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=393a5ca445f6965873eca0259a17f833"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"

SRC_URI[md5sum] = "98ba99dd3619fa90ae5c572b5d07ee2f"
SRC_URI[sha256sum] = "0f08c47f0ca48e8d97501cd671d84607318172bba6aed6f516b9daa413b04ca6"

inherit  autotools pkgconfig

COMPATIBLE_MACHINE = "(mxs|mx6|mx7)"
