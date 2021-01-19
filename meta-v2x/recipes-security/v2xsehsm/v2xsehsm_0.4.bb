# Copyright (C) 2019-2021 NXP

SUMMARY = "Adaptation layer between v2xCryptoLibrary SE API and HSM API"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://BSD-3-Clause.txt;md5=664939843ae3416d811479b21978e8b4"

DEPENDS = "imx-seco-libs lttng-ust"

SRCBRANCH = "version_0.4"
V2XSEHSM_SRC ?= "git://source.codeaurora.org/external/imx/v2xsehsm.git;protocol=ssh"
SRC_URI = "${V2XSEHSM_SRC};branch=${SRCBRANCH}"
SRCREV = "776767465745d44771c0a998abd778bf304ab162"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE += "-DSECO_LIBS_DIR=${STAGING_DIR_TARGET}${libdir}"

# Comment this line to remove tracing by default
EXTRA_OECMAKE += "-DTRACE_SETTING='-DENABLE_LTTNG'"

COMPATIBLE_MACHINE = "(mx8dxl)"
