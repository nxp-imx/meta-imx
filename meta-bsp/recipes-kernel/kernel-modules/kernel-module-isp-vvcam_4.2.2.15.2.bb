# Copyright 2020-2021 NXP

DESCRIPTION = "Kernel loadable module for ISP"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/vvcam/LICENSE;md5=64381a6ea83b48c39fe524c85f65fb44"

SRCBRANCH = "lf-5.15.y"
ISP_KERNEL_SRC ?= "git://source.codeaurora.org/external/imx/isp-vvcam.git;protocol=https"

SRC_URI = " \
    ${ISP_KERNEL_SRC};branch=${SRCBRANCH} \
"
SRCREV = "51c641880269a4ef9a813abc5ee1e5f03c009eef"

S = "${WORKDIR}/git/vvcam/v4l2"

inherit module

COMPATIBLE_MACHINE = "(mx8mp)"
