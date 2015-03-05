# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

S="${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "ae613dbd572d04165322eee4de1e232c"
SRC_URI[sha256sum] = "2f0baf8cb6bb1beee2a3fd8d646306c1645f22bcb5073009f749c8e679dea4ce"

# FIXME skip the QA error for viv-samples
INSANE_SKIP_${PN} += "rpaths"

PACKAGE_FP_TYPE = "softfp"
