# Copyright (C) 2013 Freescale Semiconductor

SUMMARY = "Nand boot write source"
DESCRIPTION = "Nand boot write source for IMX BSP"
SECTION = "base"
DEPENDS = "virtual/kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

inherit  autotools pkgconfig

PE = "1"

SRC_URI = "${FSL_MIRROR}/imx-kobs-${PV}.tar.gz"

SRC_URI[md5sum] = "1c07f922215d1fe7e202d1ba3dca0293"
SRC_URI[sha256sum] = "a2854f5dc4c5728fef83a8b68d0e3e0aaba7910557976fc46265a86dc268038a"

FILES_${PN} += "/unit_tests"
FILES_${PN}-dbg += "/unit_tests/.debug"

do_compile() {
    INCLUDE_DIR="-I${STAGING_INCDIR}  -I${STAGING_KERNEL_DIR}/include/mtd"
    oe_runmake CROSS_COMPILE="${HOST_PREFIX}" PLATFORM="${PLATFORM}" INCLUDE="${INCLUDE_DIR}" all
}

PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "(mx6)"

