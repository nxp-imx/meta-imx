# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

S="${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "00ae643cf61a531f362182978c622c61"
SRC_URI[sha256sum] = "619e050216aa084edc8f6c317973a91796b9e719a4740ea6edf510b795fa27ba"

# FIXME skip the QA error for viv-samples
INSANE_SKIP_${PN} += "rpaths"

PACKAGE_FP_TYPE = "softfp"
