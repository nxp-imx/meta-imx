# Copyright 2023 NXP
SUMMARY = "NXP i.MX Itest"
DESCRIPTION = "NXP i.MX Itest"
SECTION = "base"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8636bd68fc00cc6a3809b7b58b45f982"

DEPENDS = "zlib imx-secure-enclave"

SRC_URI = "${ITEST_SRC};branch=${SRCBRANCH}"
ITEST_SRC ?= "git://github.com/nxp-imx/itest.git;protocol=https"
SRCBRANCH = "itest_ele"
SRCREV = "732cd110975790c43e4d2aeaacfa86203f6bf220"

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

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx93-nxp-bsp)"
