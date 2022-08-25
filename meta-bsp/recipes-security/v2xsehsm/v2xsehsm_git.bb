# Copyright (C) 2019-2021 NXP

SUMMARY = "Adaptation layer between v2xCryptoLibrary SE API and HSM API"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://BSD-3-Clause.txt;md5=664939843ae3416d811479b21978e8b4"

DEPENDS = "imx-seco-libs"

SRCBRANCH = "imx_5.4.70_2.3.4"
V2XSEHSM_SRC ?= "git://github.com/nxp-imx/v2xsehsm.git;protocol=ssh"
SRC_URI = "${V2XSEHSM_SRC};branch=${SRCBRANCH} \
    file://0001-Install-header-to-standard-location.patch"
SRCREV = "84b55c650eef3ce6f7c016c7025c6732908fa30d"

S = "${WORKDIR}/git"

inherit cmake

PACKAGECONFIG ?= ""
PACKAGECONFIG[lttng] = "-DTRACE_SETTING=-DENABLE_LTTNG,,lttng-ust"

EXTRA_OECMAKE += "-DSECO_LIBS_DIR=${STAGING_DIR_TARGET}${libdir}"

COMPATIBLE_MACHINE = "(mx8dxl-nxp-bsp)"
