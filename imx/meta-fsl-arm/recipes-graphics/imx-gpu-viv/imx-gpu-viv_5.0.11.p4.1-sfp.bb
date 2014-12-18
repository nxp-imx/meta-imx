# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

S="${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "2d8859599895c4e6a27c5a7215cc055d"
SRC_URI[sha256sum] = "db89885463733bffae4625a0dd4173d9530eb9b11eda8be3ee09dc7e9c4e23ba"

# FIXME skip the QA error for viv-samples
INSANE_SKIP_${PN} += "rpaths"

PACKAGE_FP_TYPE = "softfp"
