# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "11d16bb9643d24d96d79f8f0f61a80b0"
SRC_URI[sha256sum] = "5219c463336f70578310d3056fcce478616dbdde04a0d4a77619622382da7b90"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.1', '5.0.11.p6.1-alpha')}"
