# Copyright 2020-2021 NXP

DESCRIPTION = "Kernel loadable module for ISP"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/vvcam/LICENSE;md5=64381a6ea83b48c39fe524c85f65fb44"

SRCBRANCH = "imx_5.4.70_2.3.2"
ISP_KERNEL_SRC ?= "git://source.codeaurora.org/external/imx/isp-vvcam.git;protocol=https"

SRC_URI = " \
    ${ISP_KERNEL_SRC};branch=${SRCBRANCH} \
"
SRCREV = "1197b19bf8d7fe2678afd9b141e11dbf4d5b1a6d"

S = "${WORKDIR}/git/vvcam/v4l2"

inherit module
