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
ITEST_SRC ?= "git://bitbucket.sw.nxp.com/sli/itest.git;protocol=ssh"
SRC_URI = "${ITEST_SRC};branch=${ITEST_BRANCH}"

SRCREV = "902c200b105c70c820346e1bec2127f4c7e21986"
S = "${WORKDIR}/git"

inherit cmake

OPENSSL_PATH="${STAGING_DIR_HOST}/usr"
ELE_LIB_PATH="${STAGING_DIR_HOST}/usr"
LIB_PATH="${STAGING_DIR_HOST}/usr/lib"

EXTRA_OECMAKE = " \
    -DOPENSSL_PATH="${OPENSSL_PATH}" \
    -DELE_LIB_PATH="${ELE_LIB_PATH}" \
    -DLIB_PATH="${LIB_PATH}" \
    ${EXTRA_OECMAKE_IMX}"

COMPATIBLE_MACHINE = "(imx-nxp-bsp)"
