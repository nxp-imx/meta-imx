# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

S="${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "940d4a1688dfbf39f0c2c789bb64d89b"
SRC_URI[sha256sum] = "6cc1bf0cc754c4120939f67f82259f5b285386222264c9f761c6e4a97b3c0d3a"

# FIXME skip the QA error for viv-samples
INSANE_SKIP_${PN} += "rpaths"

PACKAGE_FP_TYPE = "softfp"
