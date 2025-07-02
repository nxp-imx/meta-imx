# Copyright 2025 NXP

SUMMARY = "NXP i.MX EdgeLock 2GO OEM provisioning application"
DESCRIPTION = "NXP i.MX EdgeLock 2GO OEM provisioning application"
SECTION = "base"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=526003fe435291c11167e5ec08a53268"

DEPENDS = "cyaml smw el2go-agent"

SRC_URI = "${PROVAPP_SRC};branch=${PROVAPP_SRCBRANCH};name=oem-prov-app"
PROVAPP_SRC ?= "git://github.com/nxp-imx/oem-prov-app.git;protocol=https"
PROVAPP_SRCBRANCH = "release/version_1.x"

PV = "1.1+git${SRCPV}"

SRCREV = "release_1.1"

S = "${WORKDIR}/git"

inherit cmake

CFLAGS[unexport] = "1"
CPPFLAGS[unexport] = "1"
AS[unexport] = "1"
LD[unexport] = "1"

EXTRA_OECMAKE = " \
    -DNXP_SMW_DIR=${STAGING_DIR_HOST}${libdir}/cmake \
    -DEL2GOAGENT_ROOT=${STAGING_DIR_HOST} \
    -DCYAML_ROOT=${STAGING_DIR_HOST} \
    -DVERBOSE=2"

COMPATIBLE_MACHINE = "(imx-nxp-bsp)"
