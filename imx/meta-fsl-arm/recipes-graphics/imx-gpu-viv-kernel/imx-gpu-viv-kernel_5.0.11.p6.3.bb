# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "f6cdaf29a7d372f03ed48f18970ad362"
SRC_URI[sha256sum] = "5c12e5bc8923c2717933f5e3ea20e555acaa9ae54b096270a9ed0876b3eff321"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}"
