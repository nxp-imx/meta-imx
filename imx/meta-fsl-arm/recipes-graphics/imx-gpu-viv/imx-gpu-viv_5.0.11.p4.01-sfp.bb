# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

S="${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "3ca7de579ed5736623f85cf25ad7de7f"
SRC_URI[sha256sum] = "430504d5db7617dd1b19942f1ce222853cd69d17f2422583819bdaf1b2a02162"

# FIXME skip the QA error for viv-samples
INSANE_SKIP_${PN} += "rpaths"

PACKAGE_FP_TYPE = "softfp"
