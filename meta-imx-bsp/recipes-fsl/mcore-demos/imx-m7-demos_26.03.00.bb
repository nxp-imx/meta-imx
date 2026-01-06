# Copyright 2025-2026 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx8mn-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 
LIC_FILES_CHKSUM:mx8mnul-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 

LIC_FILES_CHKSUM:mx8mp-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"
LIC_FILES_CHKSUM:mx8mpul-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac"

LIC_FILES_CHKSUM:mx95-nxp-bsp = "file://COPYING;md5=bc649096ad3928ec06a8713b8d787eac" 

SRC_URI[imx8mn.sha256sum] = "6f866d3a6031bf3af652bb76d2c283c7f28a3088a4a44b3503e4491c2db63465"
SRC_URI[imx8mnddr3l.sha256sum] = "2eb7e50a1aeb10bd9f717418940eae67b4f60f2f8952f4f9b0dceb56b57aee16"

SRC_URI[imx8mp.sha256sum] = "51e8e96f522010cc235a6a0435fb4934172669abfcd539b01a6d2733611552f8"

SRC_URI[imx95.sha256sum] = "1ed885757d570a1bcd4309cd41d158827f855af451d140d056fa02f92e8b73eb"

COMPATIBLE_MACHINE = "(mx8mn-nxp-bsp|mx8mnul-nxp-bsp|mx8mp-nxp-bsp|mx8mpul-nxp-bsp|mx95-nxp-bsp)"
