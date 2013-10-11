# Copyright (C) 2013 Freescale Semiconductor

SUMMARY = "Universal Adapter source"
DESCRIPTION = "Universal Adapter source for IMX BSP"
SECTION = "base"
DEPENDS = "virtual/kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

PE = "1"

SRC_URI = "${FSL_MIRROR}/imx-uuc-${PV}.tar.gz"

SRC_URI[md5sum] = "e2658f905742dc4b252083ae1cf7fa2c"
SRC_URI[sha256sum] = "7a17beb03b0c008851dab42af4698360a07d9c7204b5755492ecb588e28acfcb"

FILES_${PN} += "linuxrc ${bindir}/uuc ${bindir}/sdimage "
FILES_${PN}-dbg += "${bindir}/.debug"

do_compile() {
    INCLUDE_DIR="-I${STAGING_INCDIR}"
    oe_runmake CROSS_COMPILE="${HOST_PREFIX}" PLATFORM="${PLATFORM}" INCLUDE="${INCLUDE_DIR}" all
}

do_install () {
     install linuxrc ${D}
     install -d ${D}${bindir}
     install uuc ${D}${bindir}
     install sdimage ${D}${bindir}
}

PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "(mx6)"

