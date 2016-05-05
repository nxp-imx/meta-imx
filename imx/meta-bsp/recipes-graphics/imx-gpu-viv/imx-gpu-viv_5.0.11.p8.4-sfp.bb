# Copyright (C) 2013-2016 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

S="${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "04f6227dfe1acb11bcde3a1fe9b29715"
SRC_URI[sha256sum] = "ed0be4260f420d239b33e31743c07d3ec26ccc736671542bccb3c0a11a00a50b"

# FIXME skip the QA error for viv-samples
INSANE_SKIP_${PN} += "rpaths"

PACKAGE_FP_TYPE = "softfp"
