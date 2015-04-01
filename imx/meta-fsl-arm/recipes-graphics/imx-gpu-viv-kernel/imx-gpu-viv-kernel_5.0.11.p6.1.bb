# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "6f6f47a3b9e33837ff56381f89982ddc"
SRC_URI[sha256sum] = "d6c20dc70d3a2f1f3e1a785a6dd617590b223c63d961be78d1229d40fce1257d"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.1', '5.0.11.p6.1-alpha')}"
