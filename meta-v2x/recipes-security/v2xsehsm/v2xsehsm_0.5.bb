# Copyright (C) 2019-2021 NXP

SUMMARY = "Adaptation layer between v2xCryptoLibrary SE API and HSM API"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://BSD-3-Clause.txt;md5=664939843ae3416d811479b21978e8b4"

DEPENDS = "imx-seco-libs"

SRCBRANCH = "v2x-dev"
V2XSEHSM_SRC ?= "git://source.codeaurora.org/external/imx/v2xsehsm.git;protocol=ssh"
SRC_URI = "${V2XSEHSM_SRC};branch=${SRCBRANCH}"
SRCREV = "1dd537fa5339d49de69945f701af7553cd77e7b7"

S = "${WORKDIR}/git"

inherit cmake

PACKAGECONFIG ?= ""
PACKAGECONFIG[lttng] = "-DTRACE_SETTING=-DENABLE_LTTNG,,lttng-ust"

EXTRA_OECMAKE += "-DSECO_LIBS_DIR=${STAGING_DIR_TARGET}${libdir}"

COMPATIBLE_MACHINE = "(mx8dxl)"
