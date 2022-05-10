# Copyright 2019-22 NXP

SUMMARY = "NXP i.MX SECO library"
DESCRIPTION = "NXP IMX SECO library"
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://EULA.txt;md5=cdd540474054bab41b663abd3e9eb4a0"

DEPENDS = "zlib"

SRCBRANCH = "master"
SECO_LIB_SRC ?= "git://github.com/NXP/imx-seco-libs.git;protocol=https"
SRC_URI = "${SECO_LIB_SRC};branch=${SRCBRANCH} \
        file://0001-Makefile-Fix-LIBDIR-for-multilib.patch \
        file://0002-Makefile-Fix-install-to-clear-host-user-contaminated.patch \
        file://0001-add-v2x_test-to-the-installed-binaries.patch \
"
SRCREV = "6c41488e9fd3d5804eca13e338f1869baacf639c"

S = "${WORKDIR}/git"

TARGET_CC_ARCH += "${LDFLAGS}"

do_install () {
	oe_runmake DESTDIR=${D} install
}

COMPATIBLE_MACHINE = "(mx8-nxp-bsp)"
COMPATIBLE_MACHINE:mx8m-nxp-bsp = "(^$)"
