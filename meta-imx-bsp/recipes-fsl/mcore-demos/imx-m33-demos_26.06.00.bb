# Copyright 2026 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8ulp-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 

LIC_FILES_CHKSUM:mx93-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 

SRC_URI[imx8ulp.sha256sum] = "83cfb3bf24eabb16c1386ceab7637b56905f65058f1706f184e959cc69a74ae1"

SRC_URI[imx93.sha256sum] = "a0d6a6d279689ee56c7a564b467b567c4fc98075d848792e96590e7d4db4e544"

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx93-nxp-bsp)"

