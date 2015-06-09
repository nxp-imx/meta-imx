# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "1cf95742ab128f7fb039a782172141d6"
SRC_URI[sha256sum] = "53b12854fc54642fadc68c1c79e06271ff52d815e1a9180566802bcc1e418c1c"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}"
