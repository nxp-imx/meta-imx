# Copyright 2023-2026 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8ulp-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 

LIC_FILES_CHKSUM:mx93-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

SRC_URI[imx8ulp.sha256sum] = "c748923c47d1e5d2a986889c0efe2626098bc13e074dde85c5da1009e34b4f88"

SRC_URI[imx93.sha256sum] = "fbaf3baa6916757747696ba90a23d515ee10215b19a03e9feb5d6b16cc4d6a4f"

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx93-nxp-bsp)"

