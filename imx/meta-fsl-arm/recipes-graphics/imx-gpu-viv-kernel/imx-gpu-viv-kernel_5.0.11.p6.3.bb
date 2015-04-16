# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "65b3d2cf94b91f9109e7774782f5afc3"
SRC_URI[sha256sum] = "d3cefc2a4edc467c16c4645c770692fe8f743c64f4b0f08becc46438d9631a0d"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}"
