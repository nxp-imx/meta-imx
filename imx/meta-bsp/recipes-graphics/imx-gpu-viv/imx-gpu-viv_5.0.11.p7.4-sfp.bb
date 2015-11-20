# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

S="${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "e6f2e6e61d11c6d1593eb276d6f859dd"
SRC_URI[sha256sum] = "0a0cf94fcaca609323f55da7db58b468b15ba5d632241466a54c34ef1d54dae1  "

# FIXME skip the QA error for viv-samples
INSANE_SKIP_${PN} += "rpaths"

PACKAGE_FP_TYPE = "softfp"
