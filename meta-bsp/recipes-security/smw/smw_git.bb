# Copyright 2020 NXP

SUMMARY = "NXP i.MX Security Middleware Library"
DESCRIPTION = "NXP i.MX Security Middleware Library"
SECTION = "base"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING;md5=8636bd68fc00cc6a3809b7b58b45f982"

DEPENDS = "imx-seco-libs"

SRCBRANCH = "master"
SMW_LIB_SRC ?= "git://source.codeaurora.org/external/imx/imx-smw.git;protocol=https"
SRC_URI = "${SMW_LIB_SRC};branch=${SRCBRANCH}"
SRCREV = "d92553710cd428599fb3637fd7c56527ba5ce0d8"

S = "${WORKDIR}/git"

inherit cmake

COMPATIBLE_MACHINE = "(mx8)"
COMPATIBLE_MACHINE_mx8m = "(^$)"
