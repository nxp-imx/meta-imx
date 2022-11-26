# Copyright 2020-2022 NXP

DESCRIPTION = "Kernel loadable module for ISP"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${S}/../LICENSE;md5=64381a6ea83b48c39fe524c85f65fb44"

SRC_URI = "${ISP_KERNEL_SRC};branch=${SRCBRANCH}"
ISP_KERNEL_SRC ?= "git://github.com/nxp-imx/isp-vvcam.git;protocol=https"
SRCBRANCH = "master"
SRCREV = "0bb712646345d9d65e62ce40d87949578a295f64"

S = "${WORKDIR}/git/vvcam/v4l2"

inherit module

DEBUG_PREFIX_MAP = " \
    -fmacro-prefix-map=${WORKDIR}/git/vvcam=/usr/src/debug/${PN}/${EXTENDPE}${PV}-${PR} \
    -fdebug-prefix-map=${WORKDIR}/git/vvcam=/usr/src/debug/${PN}/${EXTENDPE}${PV}-${PR} \
    -fmacro-prefix-map=${B}=/usr/src/debug/${PN}/${EXTENDPE}${PV}-${PR} \
    -fdebug-prefix-map=${B}=/usr/src/debug/${PN}/${EXTENDPE}${PV}-${PR} \
    -fdebug-prefix-map=${STAGING_DIR_HOST}= \
    -fmacro-prefix-map=${STAGING_DIR_HOST}= \
    -fdebug-prefix-map=${STAGING_DIR_NATIVE}= \
"

COMPATIBLE_MACHINE = "(mx8mp-nxp-bsp)"
