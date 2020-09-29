# Copyright (C) 2020 NXP
require optee-client.imx.inc

OPTEE_CLIENT_SRC ?= "git://source.codeaurora.org/external/imx/imx-optee-client.git;protocol=https"
SRC_URI = "${OPTEE_CLIENT_SRC};branch=${SRCBRANCH}"
SRCBRANCH = "imx_3.10.y"
SRCREV = "2a77cf88d956c34cb4a1c191bea6113e327f5fe0" 
