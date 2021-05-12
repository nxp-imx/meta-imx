# Copyright 2019-21 NXP

SUMMARY = "NXP i.MX SECO library"
DESCRIPTION = "NXP IMX SECO library"
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://EULA.txt;md5=228c72f2a91452b8a03c4cab30f30ef9"

DEPENDS = "zlib"

SRCBRANCH = "imx_5.4.70_2.3.2"
SECO_LIB_SRC ?= "git://github.com/NXP/imx-seco-libs.git;protocol=https"
SRC_URI = "${SECO_LIB_SRC};branch=${SRCBRANCH} \
        file://0001-Makefile-Fix-LIBDIR-for-multilib.patch \
        file://0002-Makefile-Fix-install-to-clear-host-user-contaminated.patch \
"
SRCREV = "501203bb629e85933e3d888877376604075a893b"

S = "${WORKDIR}/git"

TARGET_CC_ARCH += "${LDFLAGS}"

do_install () {
	oe_runmake DESTDIR=${D} install
	chown -R root:root "${D}"
}

COMPATIBLE_MACHINE = "(mx8)"
COMPATIBLE_MACHINE_mx8m = "(^$)"
