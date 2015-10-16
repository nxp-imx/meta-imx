# Copyright (C) 2013-2015 Freescale Semiconductor

SUMMARY = "Nand boot write source"
SECTION = "base"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=393a5ca445f6965873eca0259a17f833"

SRC_URI = "${FSL_MIRROR}/imx-kobs-${PV}.tar.gz"

SRC_URI[md5sum] = "e2491e13cbe1ff470bfb4444aa46556d"
SRC_URI[sha256sum] = "48a7d5df9952d41e35a91a7935f5b991ecf7e31db4d005a46f38ed365d9e03ad"

inherit  autotools pkgconfig

COMPATIBLE_MACHINE = "(imx)"
