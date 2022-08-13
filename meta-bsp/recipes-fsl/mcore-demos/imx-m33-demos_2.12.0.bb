# Copyright 2022 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8ulp-nxp-bsp = "file://COPYING;md5=be5ff43682ed6c57dfcbeb97651c2829"
LIC_FILES_CHKSUM:mx93-nxp-bsp = "file://COPYING;md5=d3c315c6eaa43e07d8c130dc3a04a011"

SRC_URI[imx8ulp.md5sum] = "e3a1c5e17c4f8105ad325cc547faaf8a"
SRC_URI[imx8ulp.sha256sum] = "5dc718aac5258c24266babed3e7e0f5abe666b872ef9b162da5d57844ab8cb17"

SRC_URI[imx93.md5sum] = "5480cb59db893244ee5da0dee2842fcf"
SRC_URI[imx93.sha256sum] = "5cd7ef02dc7ecbf5db2f5d6168a0a022097b4f8ed3e7e403976b3a5c4575bf66"

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx93-nxp-bsp)"
