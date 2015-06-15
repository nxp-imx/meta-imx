# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "3d7b739fdc2c0bb6330a30568a0ceaf6"
SRC_URI[sha256sum] = "963708145175c244e94d215d335ed31021c8a047e2c0c9d8d3b6c4d2f81ecacc"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}"
