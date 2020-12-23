# Copyright (C) 2020 NXP
require optee-client.imx.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/optee-client:"

OPTEE_CLIENT_SRC ?= "git://source.codeaurora.org/external/imx/imx-optee-client.git;protocol=https"
SRC_URI = "${OPTEE_CLIENT_SRC};branch=${SRCBRANCH} \
           file://tee-supplicant.service"
SRCBRANCH = "lf-5.10.y_1.0.0"
SRCREV = "2a77cf88d956c34cb4a1c191bea6113e327f5fe0"
