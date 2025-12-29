# Copyright 2025 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx95-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 

LIC_FILES_CHKSUM:mx952-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 

SRC_URI[imx95.sha256sum] = "1ed885757d570a1bcd4309cd41d158827f855af451d140d056fa02f92e8b73eb"

SRC_URI[imx952.sha256sum] = "75d22fd465ca4e255723d282f98851978d7fd22eea9c9bb71385d3fa1df98cc2"

COMPATIBLE_MACHINE = "(mx95-nxp-bsp|mx952-nxp-bsp)"
