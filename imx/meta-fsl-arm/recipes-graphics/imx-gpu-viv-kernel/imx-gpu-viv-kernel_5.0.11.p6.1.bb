# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "3f2d4fba9d36afff9ad53ab56a91a848"
SRC_URI[sha256sum] = "2e4b86d663f4e9bacb2155d2d4fb08deaa28d45fd979582b8664d38cacd909c7"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.1', '5.0.11.p6.1-alpha')}"
