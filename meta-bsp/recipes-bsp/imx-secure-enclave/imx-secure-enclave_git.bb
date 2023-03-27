# Copyright 2021-2023 NXP

SUMMARY = "NXP i.MX SECURE ENCLAVE library"
DESCRIPTION = "NXP IMX SECURE ENCLAVE library"
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://EULA.txt;md5=76871788f27c28af824e2ec1ca187832"

DEPENDS = " openssl"
EXTRA_OEMAKE = "PLAT=ele OPENSSL_PATH=${STAGING_INCDIR}"

SRCBRANCH = "master"
SECURE_ENCLAVE_LIB_SRC ?= "git://github.com/NXP/imx-secure-enclave.git;protocol=https"

SRC_URI = "${SECURE_ENCLAVE_LIB_SRC};branch=${SRCBRANCH}"
SRCREV = "620875138888ac5130cf5208e663378b788ed486"


S = "${WORKDIR}/git"

TARGET_CC_ARCH += "${LDFLAGS}"

do_install () {
	oe_runmake DESTDIR=${D} install_tests
}

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx93-nxp-bsp)"
