# Copyright (C) 2013-14 Freescale Semiconductor

SUMMARY = "Universal Adapter source"
DESCRIPTION = "Universal Adapter source for IMX BSP"
SECTION = "base"
DEPENDS = "virtual/kernel"
LICENSE = "GPLv2"

LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

PE = "1"

SRC_URI = "${FSL_MIRROR}/imx-uuc-${PV}.tar.gz"
S="${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "c111a44b436a5715babef897fc13ca2d"
SRC_URI[sha256sum] = "7f398aa3e735ad7176986c1c8cb08a8d9bd4d9c989b2e129ae8c9fd718f9b669"

FILES_${PN} += "linuxrc ${bindir}/uuc ${bindir}/sdimage "
FILES_${PN}-dbg += "${bindir}/.debug"

do_compile() {
    INCLUDE_DIR="-I${STAGING_INCDIR}"
    oe_runmake CROSS_COMPILE="${HOST_PREFIX}" INCLUDE="${INCLUDE_DIR}" all
}

do_install () {
     install linuxrc ${D}
     install -d ${D}${bindir}
     install uuc ${D}${bindir}
     install sdimage ${D}${bindir}
}

PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "(mx6)"

