# Copyright 2020 NXP

SUMMARY = "NXP i.MX Security Middleware Library"
DESCRIPTION = "NXP i.MX Security Middleware Library"
SECTION = "base"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING;md5=8636bd68fc00cc6a3809b7b58b45f982"

DEPENDS = "imx-seco-libs"

SRCBRANCH = "imx_5.4.24_2.1.0"
SMW_LIB_SRC ?= "git://github.com/nxp-imx/imx-smw.git;protocol=https"
SRC_URI = "${SMW_LIB_SRC};branch=${SRCBRANCH}"
SRCREV = "2377f162cbb4c6e4099c88ac18b6d68e9873e9a2"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE = "-DSECO_LIBS_EXPORT_DIR=${STAGING_DIR_TARGET}"

COMPATIBLE_MACHINE = "(mx8)"
COMPATIBLE_MACHINE_mx8m = "(^$)"
