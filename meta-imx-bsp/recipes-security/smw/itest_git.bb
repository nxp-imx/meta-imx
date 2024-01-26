# Copyright 2023 NXP
SUMMARY = "NXP i.MX Itest"
DESCRIPTION = "NXP i.MX Itest"
SECTION = "base"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8636bd68fc00cc6a3809b7b58b45f982"

DEPENDS = "imx-secure-enclave"

SRC_URI = "${ITEST_SRC};branch=${SRCBRANCH}"
ITEST_SRC ?= "git://github.com/nxp-imx/itest.git;protocol=https"
SRCBRANCH = "itest_ele"
SRCREV = "267e78b6a982d871c1a89992417a26c3c3c6fcdb"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE = " \
    -DOPENSSL_PATH="${STAGING_DIR_HOST}/usr" \
    -DELE_LIB_PATH="${STAGING_DIR_HOST}/usr" \
    -DLIB_PATH="${STAGING_DIR_HOST}${libdir}""
EXTRA_OECMAKE:append:mx95-nxp-bsp = " -DV2X=1"

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx93-nxp-bsp|mx95-nxp-bsp)"
