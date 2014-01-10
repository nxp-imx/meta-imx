# Copyright (C) 2013 Freescale Semiconductor

SUMMARY = "Nand boot write source"
DESCRIPTION = "Nand boot write source for IMX BSP"
SECTION = "base"
DEPENDS = "virtual/kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

SRC_URI = "${FSL_MIRROR}/imx-kobs-${PV}_beta.tar.gz"
S="${WORKDIR}/${PN}-${PV}_beta"

SRC_URI[md5sum] = "88d0a2e892ce0d3309390f48d4173e01"
SRC_URI[sha256sum] = "22abed5d43fea314570cf6f33b17d944180f4571932d8304fd8f84508f6b1527"

inherit  autotools pkgconfig

INCLUDE_DIR="-I${STAGING_INCDIR}  -I${STAGING_KERNEL_DIR}/include/mtd"
EXTRA_OE = "INCLUDE=/"${INCLUDE_DIR}/" all"

COMPATIBLE_MACHINE = "(mx6)"
