# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.1', '5.0.11.p6.1-alpha')}"

SRC_URI[md5sum] = "6fa448dcb6a1921a7f92244b37741eb5"
SRC_URI[sha256sum] = "b0980c650d195fb4f426b1bb151b358d49ea8877e762c831ab3d1d30714c688e"

PACKAGE_FP_TYPE = "hardfp"
