# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.1', '5.0.11.p6.1-alpha')}"

SRC_URI[md5sum] = "06b2bce6b25c64f8e505bd167dd43f05"
SRC_URI[sha256sum] = "3c12e297ba3947beb565271b520aae23aa03c3adad03d294099ed8f3d94c97fa"

PACKAGE_FP_TYPE = "hardfp"
