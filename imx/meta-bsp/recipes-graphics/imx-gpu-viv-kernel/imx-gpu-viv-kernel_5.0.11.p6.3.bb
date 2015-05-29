# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "9e43551b51f6c4b6c942ba51cc4fe413"
SRC_URI[sha256sum] = "45a3c449fd989199ed6269ca3e5023307b0ea64b60ba40dd6c58fc644efe8ca9"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}"
