# Copyright 2020-2021 NXP

DESCRIPTION = "Kernel loadable module for ISP"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${S}/../LICENSE;md5=64381a6ea83b48c39fe524c85f65fb44"

SRC_URI = "${ISP_KERNEL_SRC};branch=${SRCBRANCH}"
ISP_KERNEL_SRC ?= "git://github.com/nxp-imx/isp-vvcam.git;protocol=https"
SRCBRANCH = "lf-5.15.y_2.2.0"
SRCREV = "67e2a6fd2b80a62bf40ad46b6f6f838966fd5a5a"

S = "${WORKDIR}/git/vvcam/v4l2"

inherit module

COMPATIBLE_MACHINE = "(mx8mp-nxp-bsp)"
