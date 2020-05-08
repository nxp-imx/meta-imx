# Copyright 2020 NXP

DESCRIPTION = "Kernel loadable module for ISP"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/vvcam/LICENSE;md5=0d44219d96d7b1a522d5df0ac8446df2"

SRCBRANCH = "integration_vsi_4.0.8p1"
ISP_KERNEL_SRC ?= "git://source.codeaurora.org/external/imx/isp-vvcam.git;protocol=https"
SRC_URI = " \
    ${ISP_KERNEL_SRC};branch=${SRCBRANCH} \
"
SRCREV = "0639815dbc386a2698278e4167edcf80ef26ffd2"

S = "${WORKDIR}/git/vvcam/common"

inherit module
