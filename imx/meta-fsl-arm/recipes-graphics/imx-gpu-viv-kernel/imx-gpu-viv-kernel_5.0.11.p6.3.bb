# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "dce0dc1b7a90e2e1a8b93daa94ad97b8"
SRC_URI[sha256sum] = "5e3eed4b73adf74110c6141fb5091675875f4bf883b712347038c51c8b0f6027"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}"
