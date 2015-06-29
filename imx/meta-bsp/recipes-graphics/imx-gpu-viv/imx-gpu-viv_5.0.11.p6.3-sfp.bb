# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/imx-gpu-viv/imx-gpu-viv.inc

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}"

SRC_URI[md5sum] = "7fc27627d2989c9117da6f33346276ec"
SRC_URI[sha256sum] = "27c39cf161d9c73bea137135be4da17d854b84d5985133bdc16575747f881cf4"

# FIXME skip the QA error for viv-samples
INSANE_SKIP_${PN} += "rpaths"

PACKAGE_FP_TYPE = "softfp"
