# Copyright 2023 NXP
SUMMARY = "NXP i.MX Itest"
DESCRIPTION = "NXP i.MX Itest"
SECTION = "base"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8636bd68fc00cc6a3809b7b58b45f982"

DEPENDS = " zlib"
DEPENDS:append:mx8ulp-nxp-bsp  = " imx-secure-enclave"
DEPENDS:append:mx93-nxp-bsp  = " imx-secure-enclave"

ITEST_BRANCH = "itest_ele"
ITEST_SRC ?= "git://github.com/nxp-imx/itest.git;protocol=https"
SRC_URI = "${ITEST_SRC};branch=${ITEST_BRANCH}"

SRCREV = "fe9494809298c09a65e414ea9da19cc6cf7f2aef"
S = "${WORKDIR}/git"

inherit cmake

OPENSSL_PATH="${STAGING_DIR_HOST}/usr"
ELE_LIB_PATH="${STAGING_DIR_HOST}/usr"
LIB_PATH="${STAGING_DIR_HOST}${libdir}"

EXTRA_OECMAKE = " \
    -DOPENSSL_PATH="${OPENSSL_PATH}" \
    -DELE_LIB_PATH="${ELE_LIB_PATH}" \
    -DLIB_PATH="${LIB_PATH}" \
    ${EXTRA_OECMAKE_IMX}"

COMPATIBLE_MACHINE = "(imx-nxp-bsp)"
