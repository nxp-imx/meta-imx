# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.1', '5.0.11.p6.1-alpha')}"

SRC_URI[md5sum] = "f4fb2e2d2e4d9613f3aa527760ea6ba2"
SRC_URI[sha256sum] = "066255c6eee82afe5d82ee2fac7dc553509d43aac3cf30e498ff243cf0c96254"

PACKAGE_FP_TYPE = "hardfp"
