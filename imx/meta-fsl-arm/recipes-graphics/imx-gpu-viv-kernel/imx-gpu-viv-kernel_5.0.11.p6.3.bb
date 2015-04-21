# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "62ee95f3726c0bbeb3039349148c47c3"
SRC_URI[sha256sum] = "9b8529b5e766afa2f6c82edf992f71a292d87a5d041db9174be99031922d3441"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}"
