# Copyright 2023-2025 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8ulp-nxp-bsp = "file://COPYING;md5=10c0fda810c63b052409b15a5445671a"
LIC_FILES_CHKSUM:mx93-nxp-bsp = "file://COPYING;md5=10c0fda810c63b052409b15a5445671a"

SRC_URI[imx8ulp.sha256sum] = "2d1d48eb3f01d020917f42281581835a3c085233e9764ec845940c1e49ac317b"

SRC_URI[imx93.sha256sum] = "6da34598206fb1fb04272f095f494372d7801e4c0b96b5cbdd8c02aae7add9c1"

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx93-nxp-bsp)"

