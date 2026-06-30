# Copyright 2026 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8ulp-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

LIC_FILES_CHKSUM:mx93-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

SRC_URI[imx8ulp.sha256sum] = "d629fec2bf5dd50229b63bf67ae17c5985de4ef350d25d6aaca9eeee1b742ff0"

SRC_URI[imx93.sha256sum] = "c2761a010f99b0a6df7177acbba4e8ab8832bcb4d206b31a1702b85a3aa3d06a"

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx93-nxp-bsp)"

