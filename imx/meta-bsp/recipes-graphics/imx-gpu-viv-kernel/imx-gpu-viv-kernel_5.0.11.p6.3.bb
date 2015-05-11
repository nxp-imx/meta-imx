# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "f14f4e9d599da886a377dae803d37d67"
SRC_URI[sha256sum] = "f063b961444ca680137314c8ba818e55f3a2d603618b6b719bd9c590c88577ae"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}"
