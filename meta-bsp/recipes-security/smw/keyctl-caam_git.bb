# Copyright 2020-2023 NXP

SUMMARY = "NXP i.MX CAAM Keyctl"
DESCRIPTION = "NXP i.MX keyctl tool to manage CAAM Keys"
SECTION = "base"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8636bd68fc00cc6a3809b7b58b45f982"

DEPENDS = " openssl"

SRCBRANCH = "lf-6.1.22_2.0.0"
KEYCTL_CAAM_SRC ?= "git://github.com/nxp-imx/keyctl_caam.git;protocol=https"
SRC_URI = "${KEYCTL_CAAM_SRC};branch=${SRCBRANCH}"

SRCREV = "7f25ab3ec5694355ca4e69cdb8bc2f4954fa8b91"

S = "${WORKDIR}/git"

EXTRA_OEMAKE = " OPENSSL_PATH=${STAGING_INCDIR}"

TARGET_CC_ARCH += "${LDFLAGS}"

do_install () {
	oe_runmake DESTDIR=${D} install
}

COMPATIBLE_MACHINE = "(imx-nxp-bsp)"

