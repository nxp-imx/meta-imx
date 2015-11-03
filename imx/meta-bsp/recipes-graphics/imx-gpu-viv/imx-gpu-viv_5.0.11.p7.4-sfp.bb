# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

S="${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "2bad31a8755b7f63c273d381cd0ef84b"
SRC_URI[sha256sum] = "4a67b8322f4520b29b6941e8505162f32c77276a91ce76e7af10d610bac21afe"

# FIXME skip the QA error for viv-samples
INSANE_SKIP_${PN} += "rpaths"

PACKAGE_FP_TYPE = "softfp"
