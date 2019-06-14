# Copyright 2019 NXP
DESCRIPTION = "NXP Asynchronous Sample Rate Converter"
LICENSE = "Proprietary"
SECTION = "multimedia"
LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "529d7344db84ae8357edb6ff4fbeefa1"
SRC_URI[sha256sum] = "38b4ebea1c3a6e56f6efc4f5046d5c073095125abbcd6a1234731129899b4250"

inherit fsl-eula-unpack autotools pkgconfig

EXTRA_OECONF = "--enable-armv8 --libdir=${libdir} --bindir=/unit_tests"

INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_SYSROOT_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT  = "1"

FILES_${PN} += "/unit_tests ${datadir}/imx-mm"

COMPATIBLE_MACHINE = "(mx8)"
