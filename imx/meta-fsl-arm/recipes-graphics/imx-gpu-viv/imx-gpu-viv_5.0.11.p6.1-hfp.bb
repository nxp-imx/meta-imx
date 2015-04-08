# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.1', '5.0.11.p6.1-alpha')}"

SRC_URI[md5sum] = "c9c8718560dd568aab2c94edb7a670e9"
SRC_URI[sha256sum] = "f5dbe929d44e07fa75c8cf507cbedd754f5eb3cc98b936bd0e35440afa53215a"

PACKAGE_FP_TYPE = "hardfp"
