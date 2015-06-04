# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "097bd6c01b30bc352656e087c2911391"
SRC_URI[sha256sum] = "6ccfc607afa050138a28db45c6edef7d3d2e2aa129089902dbc19fd1d900f731"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}"
