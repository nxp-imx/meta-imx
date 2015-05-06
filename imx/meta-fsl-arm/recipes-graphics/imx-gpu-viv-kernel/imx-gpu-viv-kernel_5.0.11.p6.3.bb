# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "d259012218863ab8709650980d3dcacd"
SRC_URI[sha256sum] = "a473a51cfecae96feb6f22754f1581425c6e7195c8af85e7c930c8673e06220b"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}"
