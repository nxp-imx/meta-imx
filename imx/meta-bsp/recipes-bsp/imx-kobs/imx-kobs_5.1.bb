# Copyright (C) 2013-2015 Freescale Semiconductor

SUMMARY = "Nand boot write source"
SECTION = "base"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=393a5ca445f6965873eca0259a17f833"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz"

SRC_URI[md5sum] = "305ea23e36d26c98b664f11f40eebe5a"
SRC_URI[sha256sum] = "b2220e798432e9165f7158c302ae462e0b905d4ac930a040ca95995b37a3be35"

inherit  autotools pkgconfig

COMPATIBLE_MACHINE = "(mxs|mx6|mx7)"
