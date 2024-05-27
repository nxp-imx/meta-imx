# Copyright 2021-2024 NXP

SUMMARY = "NXP i.MX SECURE ENCLAVE library"
DESCRIPTION = "NXP IMX SECURE ENCLAVE library"
SECTION = "base"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8636bd68fc00cc6a3809b7b58b45f982"

DEPENDS = " mbedtls openssl"

SRC_URI = "${SECURE_ENCLAVE_LIB_SRC};branch=${SRCBRANCH}"
SECURE_ENCLAVE_LIB_SRC ?= "git://github.com/NXP/imx-secure-enclave.git;protocol=https"
SRCBRANCH = "master"
SRCREV = "6be581f75abd064371a09c5bdcf3bed6143f3f28"

S = "${WORKDIR}/git"

PLAT ?= "UNDEFINED"

EXTRA_OEMAKE = "PLAT=${PLAT} OPENSSL_PATH=${STAGING_INCDIR} MBEDTLS_PATH=${STAGING_DIR_HOST}${datadir}/mbedtls-source"

TARGET_CC_ARCH += "${LDFLAGS}"

do_install() {
	oe_runmake -C ${S} DESTDIR=${D} install_tests
}

FILES:${PN} += "${datadir}/se"
RDEPENDS:${PN} += "bash"
