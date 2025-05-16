# Copyright 2023-2025 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8mn-nxp-bsp = "file://COPYING;md5=a93b654673e1bc8398ed1f30e0813359"
LIC_FILES_CHKSUM:mx8mnul-nxp-bsp = "file://COPYING;md5=cf2070b16b9d4acf60a98e8cbc32a25a"

LIC_FILES_CHKSUM:mx8mp-nxp-bsp = "file://COPYING;md5=cf2070b16b9d4acf60a98e8cbc32a25a"
LIC_FILES_CHKSUM:mx8mpul-nxp-bsp = "file://COPYING;md5=cf2070b16b9d4acf60a98e8cbc32a25a"

SRC_URI[imx8mn.sha256sum] = "66e160a4267efcd2660b932d46ad6bcc645c9f2865c8ea873d4194d67fcf342c"

SRC_URI[imx8mnddr3l.sha256sum] = "e6587326e6e2ef41e854882abc4a9234825d857380e8b1b6e8980d690bb08f49"

SRC_URI[imx8mp.sha256sum] = "bf87fdce2266126f12f011abefa9cde943fe3aff6d2d86d19a03a6f7e5318c21"

COMPATIBLE_MACHINE = "(mx8mn-nxp-bsp|mx8mnul-nxp-bsp|mx8mp-nxp-bsp|mx8mpul-nxp-bsp)"

