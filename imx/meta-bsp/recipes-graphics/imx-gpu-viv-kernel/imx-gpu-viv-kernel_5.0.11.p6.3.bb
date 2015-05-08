# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "70f1cae5abad9d8f7882142d26ddd3eb"
SRC_URI[sha256sum] = "7a89ab35a2e3e0a6bfaccaa1116773461a5f4416b2fb260753297d9535bc1f89"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}"
