# Copyright 2026 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8ulp-nxp-bsp = "file://COPYING;md5=ef4f968b9dae8ba406390cd617c2301d"

LIC_FILES_CHKSUM:mx93-nxp-bsp = "file://COPYING;md5=ef4f968b9dae8ba406390cd617c2301d"

SRC_URI[imx8ulp.sha256sum] = "297a5154c991cb24496cb03a07f35ec80da059fa0435207d37f18938182776a9"

SRC_URI[imx93.sha256sum] = "068e0c439f520b51e041c28e82472455da99a61707e5f2ac7f838afdc58cfbb7"

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx93-nxp-bsp)"

