# Copyright 2020-2025 NXP

DESCRIPTION = "Kernel loadable module for ISP"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${S}/../LICENSE;md5=64381a6ea83b48c39fe524c85f65fb44"

SRC_URI = "${ISP_KERNEL_SRC};branch=${SRCBRANCH}"
ISP_KERNEL_SRC ?= "git://github.com/nxp-imx/isp-vvcam.git;protocol=https"
SRCBRANCH = "integration_vsi_4.2.2_25q4"
SRCREV = "3e7040f43dd60c5045f07bdc93c46ac825dcfc27"

S = "${UNPACKDIR}/${BP}/vvcam/v4l2"

inherit module

MODULES_MODULE_SYMVERS_LOCATION = "dwe"

DEBUG_PREFIX_MAP:prepend = " \
    -fmacro-prefix-map=${UNPACKDIR}/${BP}/vvcam=/usr/src/debug/${PN}/${EXTENDPE}${PV}-${PR} \
    -fdebug-prefix-map=${UNPACKDIR}/${BP}/vvcam=/usr/src/debug/${PN}/${EXTENDPE}${PV}-${PR} "

COMPATIBLE_MACHINE = "(mx8mp-nxp-bsp)"
