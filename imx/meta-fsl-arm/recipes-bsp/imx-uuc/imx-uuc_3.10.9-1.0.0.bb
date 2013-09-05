# Copyright (C) 2013 Freescale Semiconductor

SUMMARY = "Universal Adapter source"
DESCRIPTION = "Universal Adapter source for IMX BSP"
SECTION = "base"
DEPENDS = "virtual/kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

PE = "1"

SRC_URI = "${FSL_MIRROR}/imx-uuc-${PV}.tar.gz"

SRC_URI[md5sum] = "6431a0c932ff5421abab3fbc0317b1c2"
SRC_URI[sha256sum] = "668fdd0e1351170edef94ab1ea363e4cc10fcf082e7e7c9f66e4f9d0fbe20189"

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

