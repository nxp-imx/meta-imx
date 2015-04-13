# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "4ad01866b91c255104f10e0d4a0529be"
SRC_URI[sha256sum] = "09c600188f0106494a662acb6e8bb125d8f1fcb64827c1e2780e5289b66821bd"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.2', '5.0.11.p6.2-alpha')}"
