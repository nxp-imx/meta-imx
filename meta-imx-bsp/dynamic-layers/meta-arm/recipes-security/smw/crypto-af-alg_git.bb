# Copyright 2021, 2023 NXP

SUMMARY = "NXP i.MX CRYPTO AF_ALG"
DESCRIPTION = "NXP i.MX crypto af alg tool to perform symmetric operation"
SECTION = "base"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4ef68f113b9400b1140be9b69208a816"

SRCBRANCH = "lf-6.1.36_2.1.0"
CRYPTO_AF_ALG_SRC ?= "git://github.com/nxp-imx/crypto_af_alg.git;protocol=https"
SRC_URI = "${CRYPTO_AF_ALG_SRC};branch=${SRCBRANCH}"

SRCREV = "0be7a9fe7f0e8333f5469b19da94c2fca2998ffc"

S = "${WORKDIR}/git"

TARGET_CC_ARCH += "${LDFLAGS}"

do_install () {
	oe_runmake DESTDIR=${D} install
}

COMPATIBLE_MACHINE = "(imx-nxp-bsp)"

