# Copyright 2023 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8mp-nxp-bsp = "file://COPYING;md5=9135422c7a38dac21bf1f858b6ef3bac"
LIC_FILES_CHKSUM:mx8mpul-nxp-bsp = "file://COPYING;md5=9135422c7a38dac21bf1f858b6ef3bac"

SRC_URI[imx8mp.md5sum] = "4dc40466ca2c82a5e09c41ebdf24fd29"
SRC_URI[imx8mp.sha256sum] = "84f881d15b3a3227e5fc3942c73cfcdc11f94824d98d818e199ec5a6c7a89574"

COMPATIBLE_MACHINE = "(mx8mp-nxp-bsp|mx8mpul-nxp-bsp)"
