# Copyright (C) 2019-2021,2023 NXP

SUMMARY = "Adaptation layer between v2xCryptoLibrary SE API and HSM API"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=664939843ae3416d811479b21978e8b4"

DEPENDS = "imx-seco-libs"

SRCBRANCH = "lf-6.1.1_1.0.0"
V2XSEHSM_SRC ?= "git://github.com/nxp-imx/v2xsehsm.git;protocol=https"
SRC_URI = "${V2XSEHSM_SRC};branch=${SRCBRANCH} \
    file://0001-Install-header-to-standard-location.patch"
SRCREV = "34267fa3494f3f13a0522334351e280e052ddacf"

S = "${WORKDIR}/git"

inherit cmake

PACKAGECONFIG ?= ""
PACKAGECONFIG[lttng] = "-DTRACE_SETTING=-DENABLE_LTTNG,,lttng-ust"

EXTRA_OECMAKE += "-DSECO_LIBS_DIR=${STAGING_DIR_TARGET}${libdir}"

COMPATIBLE_MACHINE = "(mx8dxl-nxp-bsp)"
