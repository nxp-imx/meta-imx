# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.1', '5.0.11.p6.1-alpha')}"

SRC_URI[md5sum] = "a3e64f2c3d8d36ae39ddf1e1fe38bd77"
SRC_URI[sha256sum] = "83e30eb53cd51bf735066405245c62fe41f17833825e0bf2a089334b34d7ac4f"

PACKAGE_FP_TYPE = "hardfp"
