# Copyright 2020-2021 NXP

DESCRIPTION = "Kernel loadable module for ISP"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${S}/../LICENSE;md5=64381a6ea83b48c39fe524c85f65fb44"

SRC_URI = "${ISP_KERNEL_SRC};branch=${SRCBRANCH}"
ISP_KERNEL_SRC ?= "git://github.com/nxp-imx/isp-vvcam.git;protocol=https"
SRCBRANCH = "lf-5.15.y_2.2.0"
SRCREV = "b90e9fd7e3b4deb7f07123a52723a33d93a1d612"

S = "${WORKDIR}/git/vvcam/v4l2"

inherit module

COMPATIBLE_MACHINE = "(mx8mp-nxp-bsp)"
