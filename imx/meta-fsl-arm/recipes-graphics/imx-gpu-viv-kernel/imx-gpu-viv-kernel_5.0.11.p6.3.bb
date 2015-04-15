# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "f39d25d1ee0f5db8d21f07b3ccdc7207"
SRC_URI[sha256sum] = "5958f30c1fdb4c16d1fc641fcca43abe8d849c5bcb2560c96a58c7e54774c418"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}"
