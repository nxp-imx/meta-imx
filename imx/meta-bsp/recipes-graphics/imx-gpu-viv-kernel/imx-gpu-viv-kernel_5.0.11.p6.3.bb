# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "e2bd655aa5baa0d873b68c2b66ab99d8"
SRC_URI[sha256sum] = "30bd8d02a5a2089a248ff3bc3cedf1c3b0dd6b86bc3fcc5fcec4c42c02d6982a"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}"
