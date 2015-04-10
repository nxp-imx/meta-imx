# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.2', '5.0.11.p6.2-alpha')}"

SRC_URI[md5sum] = "73a45dee086cd3d21cd735d3d4c2302a"
SRC_URI[sha256sum] = "2f7fe225476989dfbab1be2964bf295a93d76d7c5d9a3fb358561a4adb0f2ba3"

# FIXME skip the QA error for viv-samples
INSANE_SKIP_${PN} += "rpaths"

PACKAGE_FP_TYPE = "softfp"
