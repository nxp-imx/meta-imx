# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

S="${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "024ea7bf6dc07ef33cdffce2256dc53d"
SRC_URI[sha256sum] = "fca37864cb53a4bf7fc00ab7210cc772ebb04170900903a8dd12497be8ca5e2e"

# FIXME skip the QA error for viv-samples
INSANE_SKIP_${PN} += "rpaths"

PACKAGE_FP_TYPE = "softfp"
