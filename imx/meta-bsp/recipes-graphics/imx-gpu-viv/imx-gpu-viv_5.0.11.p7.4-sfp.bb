# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

S="${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "e5b9d9c43aaa9b4b1c2a45c8ad72334b"
SRC_URI[sha256sum] = "652dd57494c250c6fd89b9777d299624665b9a61d31e2da9bb32e45a5c6b16e5"

# FIXME skip the QA error for viv-samples
INSANE_SKIP_${PN} += "rpaths"

PACKAGE_FP_TYPE = "softfp"
