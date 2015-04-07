# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.1', '5.0.11.p6.1-alpha')}"

SRC_URI[md5sum] = "7e4b66473f29f2850ed83c7538116181"
SRC_URI[sha256sum] = "e4586922f4b28aa64a9cbb09077ef9fcfdbf0228d7e124278b36acdcb8f164ef"

PACKAGE_FP_TYPE = "hardfp"
