# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

S="${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "dd046342034f583e801560459f9c0232"
SRC_URI[sha256sum] = "d3e290bf0d74c791394486207d30bbd817a7caf880bcaa9401c2872ad2674da4"

# FIXME skip the QA error for viv-samples
INSANE_SKIP_${PN} += "rpaths"

PACKAGE_FP_TYPE = "softfp"
