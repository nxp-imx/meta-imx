# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

S="${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "7c21a9ee10b716fb663c349b99b80ede"
SRC_URI[sha256sum] = "db0aa3765790b3b132c52f7c562d97f1cd19191d348b001b007cb2eee71e85d0"

# FIXME skip the QA error for viv-samples
INSANE_SKIP_${PN} += "rpaths"

PACKAGE_FP_TYPE = "softfp"
