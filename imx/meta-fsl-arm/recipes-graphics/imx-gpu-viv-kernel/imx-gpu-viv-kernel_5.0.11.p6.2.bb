# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "4c2cfd98d6f745d40cbb27a09b92da76"
SRC_URI[sha256sum] = "e7ed92090b8ff2ed81e4bd1fdb8813ea1a6bb74977b7fe73f7e8c708498e7fca"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.2', '5.0.11.p6.2-alpha')}"
