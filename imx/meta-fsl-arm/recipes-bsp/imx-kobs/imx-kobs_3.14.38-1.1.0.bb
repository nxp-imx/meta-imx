# Copyright (C) 2013-2015 Freescale Semiconductor

SUMMARY = "Nand boot write source"
SECTION = "base"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=393a5ca445f6965873eca0259a17f833"

SRC_URI = "${FSL_MIRROR}/${PN}-3.14.28-6QP-beta.tar.gz"
S = "${WORKDIR}/${PN}-3.14.28-6QP-beta"

SRC_URI[md5sum] = "4c8bb33467a7bcb593d52eda20539691"
SRC_URI[sha256sum] = "3642d553b19b7333b19a49c3fd08d4bf38f7ee9837b42fdaff4b14165553266f"

inherit  autotools pkgconfig

COMPATIBLE_MACHINE = "(mxs|mx6|mx7)"
