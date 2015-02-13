# Copyright (C) 2013, 2014 Freescale Semiconductor

SUMMARY = "Nand boot write source"
SECTION = "base"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=393a5ca445f6965873eca0259a17f833"

SRC_URI = "${FSL_MIRROR}/imx-kobs-${PV}.tar.gz"

SRC_URI[md5sum] = "6fad7dc9cf97b663dbf7775e42e5eab6"
SRC_URI[sha256sum] = "052612b28d56c7944b177ae44d202b0408bde364cfbb61653c2fa8de4a48ea72"

inherit  autotools pkgconfig
