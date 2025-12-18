# Copyright 2025 NXP

SUMMARY = "NXP i.MX EdgeLock 2GO OEM provisioning application"
DESCRIPTION = "NXP i.MX EdgeLock 2GO OEM provisioning application"
SECTION = "base"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7fc11e65b98453fd7684bb39ad6dfb48"

DEPENDS = "cyaml smw el2go-agent"

SRC_URI = "${PROVAPP_SRC};branch=${SRCBRANCH};name=oem-prov-app"
PROVAPP_SRC ?= "git://github.com/nxp-imx/oem-prov-app.git;protocol=https"
SRCBRANCH = "master"

PV = "2.0+git${SRCPV}"

SRCREV = "0ad45efa13d942a9dbbdc45c647e6d03a2c892e5"

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
