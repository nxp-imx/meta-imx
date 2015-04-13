# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.2', '5.0.11.p6.2-alpha')}"

SRC_URI[md5sum] = "b4dba0a97da0808f9b54fc89f4c4322b"
SRC_URI[sha256sum] = "dba73aac9482dcf1764e6cd2388ba37e46fafd1abff445cc4144ff2fe652763a"

PACKAGE_FP_TYPE = "hardfp"
