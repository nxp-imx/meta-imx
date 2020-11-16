# Copyright 2020 NXP

DESCRIPTION = "Kernel loadable module for ISP"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/vvcam/LICENSE;md5=64381a6ea83b48c39fe524c85f65fb44"

SRCBRANCH = "integration_vsi_4.2.2p4_basler_daA3840_30mc_NXP_4.2.2p4_309894_1_20201030-imx8mp_v3.1.2"
ISP_KERNEL_SRC ?= "git://source.codeaurora.org/external/imx/isp-vvcam.git;protocol=https"

SRC_URI = " \
    ${ISP_KERNEL_SRC};branch=${SRCBRANCH} \
"
SRCREV = "1b67fa5cea06f22d0960c2c5f9b367d88c7feccb" 

S = "${WORKDIR}/git/vvcam/v4l2"

inherit module
