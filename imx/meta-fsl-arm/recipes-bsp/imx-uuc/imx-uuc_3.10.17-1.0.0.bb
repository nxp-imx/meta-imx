# Copyright (C) 2013 Freescale Semiconductor

SUMMARY = "Universal Adapter source"
DESCRIPTION = "Universal Adapter source for IMX BSP"
SECTION = "base"
DEPENDS = "virtual/kernel"
LICENSE = "GPLv2"

LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

PE = "1"

SRC_URI = "${FSL_MIRROR}/imx-uuc-${PV}_beta.tar.gz"
S="${WORKDIR}/${PN}-${PV}_beta"

SRC_URI[md5sum] = "22cc43c9a3b1a0eb1a82e0fcbade8c37"
SRC_URI[sha256sum] = "bd96d19ec0399fbebf09c3692f77ee8c76b27988c3bf616d3cecb67a8552ba96"

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

