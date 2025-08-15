# Copyright 2025 NXP

SUMMARY = "NXP i.MX EdgeLock 2GO OEM provisioning application"
DESCRIPTION = "NXP i.MX EdgeLock 2GO OEM provisioning application"
SECTION = "base"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=526003fe435291c11167e5ec08a53268"

DEPENDS = "cyaml smw el2go-agent"

SRC_URI = "${PROVAPP_SRC};branch=${SRCBRANCH};name=oem-prov-app"
PROVAPP_SRC ?= "git://github.com/nxp-imx/oem-prov-app.git;protocol=https"
SRCBRANCH = "release/version_2.x"

PV = "2.0+git${SRCPV}"

SRCREV = "47d3b9b62b8f7824c629a8e90217df8d7f5ce301"
S = "${WORKDIR}/git"

inherit cmake

CFLAGS[unexport] = "1"
CPPFLAGS[unexport] = "1"
AS[unexport] = "1"
LD[unexport] = "1"

EXTRA_OECMAKE = " \
    -DNXP_SMW_DIR=${STAGING_DIR_HOST}${libdir}/cmake \
    -Del2go_agent_DIR=${STAGING_DIR_HOST}${libdir}/cmake/el2go-agent \
    -DCYAML_ROOT=${STAGING_DIR_HOST} \
    -DVERBOSE=2"

COMPATIBLE_MACHINE = "(imx-nxp-bsp)"
