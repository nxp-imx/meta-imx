# Copyright 2019-22 NXP

SUMMARY = "NXP i.MX SECO library"
DESCRIPTION = "NXP IMX SECO library"
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://EULA.txt;md5=d3c315c6eaa43e07d8c130dc3a04a011"

DEPENDS = "zlib"

SRCBRANCH = "imx_5.4.70_2.3.9"
SECO_LIB_SRC ?= "git://github.com/NXP/imx-seco-libs.git;protocol=https"
SRC_URI = "${SECO_LIB_SRC};branch=${SRCBRANCH} \
        file://0001-Makefile-Fix-LIBDIR-for-multilib.patch \
        file://0002-Makefile-Fix-install-to-clear-host-user-contaminated.patch \
        file://0001-add-v2x_test-to-the-installed-binaries.patch \
"
SRCREV = "b2550476388e1d1453bddbf356844301467c7bfa"

S = "${WORKDIR}/git"

TARGET_CC_ARCH += "${LDFLAGS}"

do_install () {
	oe_runmake DESTDIR=${D} install
}

COMPATIBLE_MACHINE = "(mx8-nxp-bsp)"
COMPATIBLE_MACHINE:mx8m-nxp-bsp = "(^$)"
