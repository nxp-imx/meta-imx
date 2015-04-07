# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "3ed34929962cbbf1061200624af193bd"
SRC_URI[sha256sum] = "50fa8fd622c9949e0feda9a4c50b96e3d99dd8437c39ce0eb2b7c2229ca1a8f2"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.1', '5.0.11.p6.1-alpha')}"
