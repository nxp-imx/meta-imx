# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.1', '5.0.11.p6.1-alpha')}"

SRC_URI[md5sum] = "93285dc0ab41ba61910cd535015b6529"
SRC_URI[sha256sum] = "8c20873f9af98c55a73ccf656a3117495ec2980eb18aca881936f72cd6dfbd2d"

PACKAGE_FP_TYPE = "hardfp"
