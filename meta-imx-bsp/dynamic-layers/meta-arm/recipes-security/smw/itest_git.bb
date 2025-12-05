# Copyright 2023-2025 NXP
SUMMARY = "NXP i.MX Itest"
DESCRIPTION = "NXP i.MX Itest"
SECTION = "base"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8636bd68fc00cc6a3809b7b58b45f982"

SRC_URI = "${ITEST_SRC};branch=${SRCBRANCH}"
ITEST_SRC ?= "git://github.com/nxp-imx/itest.git;protocol=https"
SRCBRANCH = "master"
SRCREV = "64a25265dd3c28742769ff5f6b002e379bad9d7e"

inherit cmake

PACKAGECONFIG:mx8dxl-nxp-bsp ??= "ele-seco"
PACKAGECONFIG:mx8ulp-nxp-bsp ??= "ele"
PACKAGECONFIG:mx91-nxp-bsp   ??= "ele"
PACKAGECONFIG:mx93-nxp-bsp   ??= "ele"
PACKAGECONFIG:mx943-nxp-bsp  ??= "ele ele-seco prime"
PACKAGECONFIG:mx95-nxp-bsp   ??= "ele ele-seco"
PACKAGECONFIG:mx952-nxp-bsp  ??= "ele ele-seco prime"

PACKAGECONFIG[ele]      = "-DELE=1,,imx-secure-enclave"
PACKAGECONFIG[ele-seco] = "-DV2X=1,,imx-secure-enclave-seco"
PACKAGECONFIG[prime]    = "-DPRIME=1,,imx-secure-enclave-prime"

EXTRA_OECMAKE = " \
    -DOPENSSL_PATH="${STAGING_DIR_HOST}/usr" \
    -DELE_LIB_PATH="${STAGING_DIR_HOST}/usr" \
    -DLIB_PATH="${STAGING_DIR_HOST}${libdir}""

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

COMPATIBLE_MACHINE = "(mx8dxl-nxp-bsp|mx8ulp-nxp-bsp|mx91-nxp-bsp|mx93-nxp-bsp|mx943-nxp-bsp|mx95-nxp-bsp)"
