# Copyright 2023-2025 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8ulp-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

LIC_FILES_CHKSUM:mx93-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

SRC_URI[imx8ulp.sha256sum] = "98485dcee4f53dd4b2616bf88b344e649d360cfbd483efa9753b2c8e0403a4de"

SRC_URI[imx93.sha256sum] = "ca4776574ff83dc9abad8df07b841183927b9f6cc55b52201bc7d932871ac470"

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx93-nxp-bsp)"

