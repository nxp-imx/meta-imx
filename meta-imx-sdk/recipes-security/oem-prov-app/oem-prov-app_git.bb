# Copyright 2025, 2026 NXP

SUMMARY = "NXP i.MX EdgeLock 2GO OEM provisioning application"
DESCRIPTION = "NXP i.MX EdgeLock 2GO OEM provisioning application"
SECTION = "base"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0d22268ff9ccfaa65c4081bd9f9cd77c"

DEPENDS = "cyaml smw el2go-agent"

SRC_URI = "${PROVAPP_SRC};branch=${SRCBRANCH};name=oem-prov-app"
PROVAPP_SRC ?= "git://github.com/nxp-imx/oem-prov-app.git;protocol=https"
SRCBRANCH = "release/version_2.x"

PV = "2.3+git${SRCPV}"

SRCREV = "ceda6e8a7dcbee0210295f97a8967c0e32302123"

inherit cmake pkgconfig

CFLAGS[unexport] = "1"
CPPFLAGS[unexport] = "1"
AS[unexport] = "1"
LD[unexport] = "1"

EXTRA_OECMAKE = " \
    -DNXP_SMW_DIR=${STAGING_DIR_HOST}${libdir}/cmake \
    -Del2go_agent_DIR=${STAGING_DIR_HOST}${libdir}/cmake/el2go-agent \
    -DVERBOSE=2"

COMPATIBLE_MACHINE = "(imx-nxp-bsp)"
