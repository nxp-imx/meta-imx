# Copyright 2019-20 NXP

SUMMARY = "NXP i.MX SECO library"
DESCRIPTION = "NXP IMX SECO library"
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://LA_OPT_NXP_Software_License.htm;md5=6a8fcab25f3d3f5c2898456114b91f44"

DEPENDS = "zlib"

SRCBRANCH = "imx_5.4.3_2.0.0"
SECO_LIB_SRC ?= "git://github.com/NXP/imx-seco-libs.git;protocol=https"
SRC_URI = "${SECO_LIB_SRC};branch=${SRCBRANCH}"
SRCREV = "0fe2ad0d0f0ef88387aaf72e7a23c9b598340c3b"

S = "${WORKDIR}/git"

TARGET_CC_ARCH += "${LDFLAGS}"

do_install () {
	oe_runmake DESTDIR=${D} install
}

COMPATIBLE_MACHINE = "(mx8)"
COMPATIBLE_MACHINE_mx8m = "(^$)"
