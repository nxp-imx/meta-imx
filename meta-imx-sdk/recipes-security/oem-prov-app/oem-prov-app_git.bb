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

SRCREV = "ca6cd963315b27d163d1c23c41851b68964c2a2f"
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
