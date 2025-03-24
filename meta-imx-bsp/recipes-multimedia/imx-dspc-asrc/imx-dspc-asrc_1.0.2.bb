# Copyright 2019,2025 NXP
DESCRIPTION = "NXP Asynchronous Sample Rate Converter"
LICENSE = "Proprietary"
SECTION = "multimedia"
LIC_FILES_CHKSUM = "file://COPYING;md5=c0fb372b5d7f12181de23ef480f225f3"

IMX_SRCREV_ABBREV = "ce4ae5a"

SRC_URI[sha256sum] = "15f6ace2713103ac845fc3905ccb9ef68748ce65e9542ee30b9ef4c91a2dd438"

inherit fsl-eula-recent fsl-eula2-unpack2 autotools pkgconfig

EXTRA_OECONF = "--enable-armv8 --libdir=${libdir} --bindir=/unit_tests"

INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_SYSROOT_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT  = "1"

do_install () {
    autotools_do_install
}

FILES:${PN} += "/unit_tests ${datadir}/imx-mm"

COMPATIBLE_MACHINE = "(mx8-nxp-bsp|mx9-nxp-bsp)"
