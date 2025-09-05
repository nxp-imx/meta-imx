# Copyright 2023-2024 NXP
SUMMARY = "NXP i.MX Itest"
DESCRIPTION = "NXP i.MX Itest"
SECTION = "base"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8636bd68fc00cc6a3809b7b58b45f982"

SRC_URI = "${ITEST_SRC};branch=${SRCBRANCH}"
ITEST_SRC ?= "git://github.com/nxp-imx/itest.git;protocol=https"
SRCBRANCH = "lf-6.6.52_2.2.0"
SRCREV = "6087762a69fe51bea508b1383d54ff28a10eef9f"

S = "${WORKDIR}/git"

inherit cmake

PACKAGECONFIG:mx8dxl-nxp-bsp ??= "ele-seco"
PACKAGECONFIG:mx8ulp-nxp-bsp ??= "ele"
PACKAGECONFIG:mx91-nxp-bsp   ??= "ele"
PACKAGECONFIG:mx93-nxp-bsp   ??= "ele"
PACKAGECONFIG:mx95-nxp-bsp   ??= "ele ele-seco"

PACKAGECONFIG[ele]      = "-DELE=1,,imx-secure-enclave"
PACKAGECONFIG[ele-seco] = "-DV2X=1,,imx-secure-enclave-seco"

EXTRA_OECMAKE = " \
    -DOPENSSL_PATH="${STAGING_DIR_HOST}/usr" \
    -DELE_LIB_PATH="${STAGING_DIR_HOST}/usr" \
    -DLIB_PATH="${STAGING_DIR_HOST}${libdir}""

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

COMPATIBLE_MACHINE = "(mx8dxl-nxp-bsp|mx8ulp-nxp-bsp|mx91-nxp-bsp|mx93-nxp-bsp|mx95-nxp-bsp)"
