# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/imx-gpu-viv/imx-gpu-viv-v6.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

S="${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "ddd7056ea8ecae703ff97d8803ff0033"
SRC_URI[sha256sum] = "2bb6e2549f8433fc288f167502b5b987db12f5c112e130fac425cc2f5f32b86c"

PACKAGE_FP_TYPE = "hardfp"

COMPATIBLE_MACHINE = "(mx6q|mx6dl|mx6sx|mx6sl|mx7ulp)"
