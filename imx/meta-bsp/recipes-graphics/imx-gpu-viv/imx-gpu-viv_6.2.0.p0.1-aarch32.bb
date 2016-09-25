# Copyright (C) 2013-2016 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/imx-gpu-viv/imx-gpu-viv-v6.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

S="${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "1621294b51ae760bb75be304ca48f436"
SRC_URI[sha256sum] = "4806aa9b76809ae4a3c52a3939f0ccda87bbe3e44d5db079fc98adaa46299786"

PACKAGE_FP_TYPE = "hardfp"

COMPATIBLE_MACHINE = "(mx6q|mx6dl|mx6sx|mx6sl|mx7ulp)"
