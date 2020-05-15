# Copyright 2020 NXP

DESCRIPTION = "Kernel loadable module for ISP"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/vvcam/LICENSE;md5=0d44219d96d7b1a522d5df0ac8446df2"

SRCBRANCH = "imx_5.4.24_2.1.0"
ISP_KERNEL_SRC ?= "git://source.codeaurora.org/external/imx/isp-vvcam.git;protocol=https"
SRC_URI = " \
    ${ISP_KERNEL_SRC};branch=${SRCBRANCH} \
"
SRCREV = "f0bba8bddbde4dc18fc96722d9325aa86bca582b"

S = "${WORKDIR}/git/vvcam/common"

inherit module
