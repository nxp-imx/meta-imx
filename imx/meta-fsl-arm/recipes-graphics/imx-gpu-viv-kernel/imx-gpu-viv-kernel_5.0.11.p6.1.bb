# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "92e2b98a90524aa2496216e3f61e9f58"
SRC_URI[sha256sum] = "265c8e52143c3cbde4d5410a80930d8c807119e00c46a35dd9cc5003087bbeaa"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.1', '5.0.11.p6.1-alpha')}"
