# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "9fdaeb18f525e3137dddffda31e23e91"
SRC_URI[sha256sum] = "ccb1479271ff06a7f3c005b9d2aa6522ff6a3e5bb226c6d9e9eb3db35774c293"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}"
