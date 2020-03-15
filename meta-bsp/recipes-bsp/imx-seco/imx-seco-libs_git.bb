# Copyright 2019-20 NXP

SUMMARY = "NXP i.MX SECO library"
DESCRIPTION = "NXP IMX SECO library"
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://LA_OPT_NXP_Software_License.htm;md5=6a8fcab25f3d3f5c2898456114b91f44"

DEPENDS = "zlib"

SRCBRANCH = "master"
SECO_LIB_SRC ?= "git://github.com/NXP/imx-seco-libs.git;protocol=https"
SRC_URI = "${SECO_LIB_SRC};branch=${SRCBRANCH}"
SRCREV = "bb7bc6bb13112d8fd61d079d9304ccf28ee5e49f"

S = "${WORKDIR}/git"

TARGET_CC_ARCH += "${LDFLAGS}"

do_install () {
	oe_runmake DESTDIR=${D} install
}

COMPATIBLE_MACHINE = "(mx8)"
COMPATIBLE_MACHINE_mx8m = "(^$)"
