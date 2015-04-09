# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.1', '5.0.11.p6.1-alpha')}"

SRC_URI[md5sum] = "db3a9aa4accb26a40ab09a07086a6118"
SRC_URI[sha256sum] = "5ba1e93c32fabdb7cfca61df847cef85b0f483a736c977096870713387dc6a91"

PACKAGE_FP_TYPE = "hardfp"
