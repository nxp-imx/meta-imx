# Copyright 2020 NXP

DESCRIPTION = "Kernel loadable module for ISP"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/vvcam/LICENSE;md5=19597abeeaf4f877fadedbd2b323ab55"

SRCBRANCH = "imx_5.4.47_2.2.0"
ISP_KERNEL_SRC ?= "git://source.codeaurora.org/external/imx/isp-vvcam.git;protocol=https"
SRC_URI = " \
    ${ISP_KERNEL_SRC};branch=${SRCBRANCH} \
"
SRCREV = "d0339d343e7137884ef1e0342e305285ac338031"

S = "${WORKDIR}/git/vvcam/v4l2"

inherit module
