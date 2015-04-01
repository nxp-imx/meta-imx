# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.1', '5.0.11.p6.1-alpha')}"

SRC_URI[md5sum] = "ab7cf0b1b0482bdedaccf2064e6f2c54"
SRC_URI[sha256sum] = "5c09acabe8ef6155c7a29a2ade5fab5706a754343f78ee5f41543ac332990150"

PACKAGE_FP_TYPE = "hardfp"
