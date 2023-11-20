# Copyright 2021-2023 NXP

SUMMARY = "NXP i.MX SECURE ENCLAVE library"
DESCRIPTION = "NXP IMX SECURE ENCLAVE library"
SECTION = "base"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8636bd68fc00cc6a3809b7b58b45f982"

DEPENDS = " openssl"

SRC_URI = "${SECURE_ENCLAVE_LIB_SRC};branch=${SRCBRANCH}"
SECURE_ENCLAVE_LIB_SRC ?= "git://github.com/NXP/imx-secure-enclave.git;protocol=https"
SRCBRANCH = "lf-6.1.55_2.2.0"
SRCREV = "b71f99ea50c96876b70164a6b828c40f909ee99f"

S = "${WORKDIR}/git"

EXTRA_OEMAKE = "PLAT=ele OPENSSL_PATH=${STAGING_INCDIR}"

TARGET_CC_ARCH += "${LDFLAGS}"

do_install () {
	oe_runmake -C ${S} DESTDIR=${D} install_tests
}

FILES:${PN} += "${datadir}/se"
RDEPENDS:${PN} += "bash"

COMPATIBLE_MACHINE = "(mx8-nxp-bsp|mx9-nxp-bsp)"
