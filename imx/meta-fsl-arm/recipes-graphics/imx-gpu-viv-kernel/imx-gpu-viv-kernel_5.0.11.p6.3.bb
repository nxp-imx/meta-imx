# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "827e97616c1e554aca4ac272421e45af"
SRC_URI[sha256sum] = "ba41232f38e2d2163981636913fe397722f69243daf50ef80105b856beb6e393"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}"
