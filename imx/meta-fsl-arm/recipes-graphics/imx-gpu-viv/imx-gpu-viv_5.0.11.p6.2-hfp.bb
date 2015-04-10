# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.2', '5.0.11.p6.2-alpha')}"

SRC_URI[md5sum] = "1886bd9632e60005c790b808d2ef2c36"
SRC_URI[sha256sum] = "5f6208066e90ae6340e6fca3dfeec1b41f154ba5330292ee6efc2e81aa921568"

PACKAGE_FP_TYPE = "hardfp"
