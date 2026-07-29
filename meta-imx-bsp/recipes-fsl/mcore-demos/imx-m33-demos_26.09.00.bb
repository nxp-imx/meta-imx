# Copyright 2026 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8ulp-nxp-bsp = "file://COPYING;md5=ef4f968b9dae8ba406390cd617c2301d"

LIC_FILES_CHKSUM:mx93-nxp-bsp = "file://COPYING;md5=ef4f968b9dae8ba406390cd617c2301d"

SRC_URI[imx8ulp.sha256sum] = "0600cd9a5f3d0fba9c0cb6e694a301d748290228c3c0f6901c17d12c09a75251"

SRC_URI[imx93.sha256sum] = "068e0c439f520b51e041c28e82472455da99a61707e5f2ac7f838afdc58cfbb7"

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx93-nxp-bsp)"

