# Copyright 2023-2025 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8ulp-nxp-bsp = "file://COPYING;md5=10c0fda810c63b052409b15a5445671a"
LIC_FILES_CHKSUM:mx93-nxp-bsp = "file://COPYING;md5=cf2070b16b9d4acf60a98e8cbc32a25a"

SRC_URI[imx8ulp.sha256sum] = "f6f60cfe0139850582a73426fda3cf59d7435c01bfe1e5cbfc50120bb9843970"

SRC_URI[imx93.sha256sum] = "6da34598206fb1fb04272f095f494372d7801e4c0b96b5cbdd8c02aae7add9c1"

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx93-nxp-bsp)"

