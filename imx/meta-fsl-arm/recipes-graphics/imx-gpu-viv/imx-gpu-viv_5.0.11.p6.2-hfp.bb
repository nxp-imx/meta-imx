# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.2', '5.0.11.p6.2-alpha')}"

SRC_URI[md5sum] = "985cc5fc17ffbe45ed888404308a710e"
SRC_URI[sha256sum] = "0bbd24ded059956b669263ebd2e78da4c7f8fbf586b3fd9f4728fb9dd3525030"

PACKAGE_FP_TYPE = "hardfp"
