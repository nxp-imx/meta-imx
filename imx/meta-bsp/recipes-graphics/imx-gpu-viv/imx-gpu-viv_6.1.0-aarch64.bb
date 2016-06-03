# Copyright (C) 2013-2016 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

S="${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "b3e4d7174fd3880bfa3775383fcbe679"
SRC_URI[sha256sum] = "7b2c92e5c2139e6a94b8fab3ce75dc9e585afff3661a95b8ff15392b072b8f2a"

PACKAGE_FP_TYPE = "hardfp"

COMPATIBLE_MACHINE = "(mx8)"
