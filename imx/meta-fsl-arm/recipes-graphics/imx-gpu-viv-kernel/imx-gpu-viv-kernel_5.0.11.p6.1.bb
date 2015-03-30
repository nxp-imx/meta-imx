# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "15a60cede186c118bf699a572a2c5404"
SRC_URI[sha256sum] = "23c2f94d8b521814a062aac8f00a0e119543caf764ac20c5b1570334eb46a03c"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.1', '5.0.11.p6.1-alpha')}"
