# Copyright (C) 2013-2015 Freescale Semiconductor

SUMMARY = "Nand boot write source"
SECTION = "base"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=393a5ca445f6965873eca0259a17f833"

SRC_URI = "${FSL_MIRROR}/${PN}-3.14.38-6QP-beta.tar.gz"
S = "${WORKDIR}/${PN}-3.14.38-6QP-beta"

SRC_URI[md5sum] = "a2cdd22b6fc3a2cadc63cb24030b387a"
SRC_URI[sha256sum] = "9f31a0cef7de90897c2a8cfec1c0462cb9ec6ecff9c0e06692b9f55d628f7a5f"

inherit  autotools pkgconfig

COMPATIBLE_MACHINE = "(mxs|mx6|mx7)"
