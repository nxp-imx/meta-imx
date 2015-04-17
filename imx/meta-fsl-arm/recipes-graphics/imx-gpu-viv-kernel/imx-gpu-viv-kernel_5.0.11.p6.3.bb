# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "8d59cabf2effe3f3d1053abafb8c658d"
SRC_URI[sha256sum] = "37e73d9817656c6c67c4930e61ebeb2aed68d4febbd86484fb5d4b2bb3ab33cf"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}"
