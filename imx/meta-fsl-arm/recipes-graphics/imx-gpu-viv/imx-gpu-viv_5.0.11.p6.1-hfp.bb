# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.1', '5.0.11.p6.1-alpha')}"

SRC_URI[md5sum] = "2aef0c8ff305925023efa20c1bbc2484"
SRC_URI[sha256sum] = "a7055eb2b7af28b70a153d93f7c88656833acd0d5711c732bd44162272f6f7c5"

PACKAGE_FP_TYPE = "hardfp"
