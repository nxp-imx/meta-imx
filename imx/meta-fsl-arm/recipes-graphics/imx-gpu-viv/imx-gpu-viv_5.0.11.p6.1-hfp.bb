# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.1', '5.0.11.p6.1-alpha')}"

SRC_URI[md5sum] = "56f6102b98efe3cfc4151db0ce78be94"
SRC_URI[sha256sum] = "52808f83a0cdac660e1ea190999127e7a0f4024ecd3e4ce539f2077e740cc76b"

PACKAGE_FP_TYPE = "hardfp"
