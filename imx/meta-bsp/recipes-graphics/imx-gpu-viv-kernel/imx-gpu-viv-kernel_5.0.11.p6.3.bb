# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "1bf616bf4e55c14c15254b78f60fa5a2"
SRC_URI[sha256sum] = "7d2a82ae6083582522fbb059f691f48a4958821ae6a8a5a0689e04c5511bebc7"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}"
