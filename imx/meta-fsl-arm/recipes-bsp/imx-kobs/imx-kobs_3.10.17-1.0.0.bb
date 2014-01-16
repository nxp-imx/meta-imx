# Copyright (C) 2013-14 Freescale Semiconductor

SUMMARY = "Nand boot write source"
DESCRIPTION = "Nand boot write source for IMX BSP"
SECTION = "base"
DEPENDS = "virtual/kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

PE = "1"

SRC_URI = "${FSL_MIRROR}/imx-kobs-${PV}.tar.gz"
S="${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "df477a6ce9abfa3077fa1a7bb97942e1"
SRC_URI[sha256sum] = "9458bac13a8e58e3d13cb2861d2b3d2cffd990e675c919c65548b71b6dda2776"

inherit  autotools pkgconfig

INCLUDE_DIR="-I${STAGING_INCDIR}  -I${STAGING_KERNEL_DIR}/include/mtd"
EXTRA_OE = "INCLUDE=/"${INCLUDE_DIR}/" all"

COMPATIBLE_MACHINE = "(mx6)"
