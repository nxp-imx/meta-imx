# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "3e1ae0417e183f17ede325bc51a3a26c"
SRC_URI[sha256sum] = "ec8f0baccf98123fc40b660b1b01d95582ec91391d5bc5ee27636cb4849174ef"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.2', '5.0.11.p6.2-alpha')}"
