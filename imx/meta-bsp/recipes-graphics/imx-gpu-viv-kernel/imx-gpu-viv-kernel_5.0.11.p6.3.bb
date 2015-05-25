# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "85eed2488cfe0ef9f410ee3ff16fd42f"
SRC_URI[sha256sum] = "1f12cb46b405c0bb6f0ce5dbd1145933cc1f7a40170f36f6d0a798ba080357b6"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}"
