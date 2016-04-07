# Copyright (C) 2013-2016 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

S="${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "8eeaade3f474778ac6fe227770183404"
SRC_URI[sha256sum] = "59925836cc90acf9db938ebefb4baefb539dca4b0e0ff29f1c233137ad7eb399"

# FIXME skip the QA error for viv-samples
INSANE_SKIP_${PN} += "rpaths"

PACKAGE_FP_TYPE = "softfp"
