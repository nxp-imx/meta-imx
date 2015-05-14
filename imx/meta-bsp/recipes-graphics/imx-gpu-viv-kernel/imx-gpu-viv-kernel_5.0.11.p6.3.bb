# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "dab64b6b4c776d62c50e890d00e853e1"
SRC_URI[sha256sum] = "777fb835a306693988f19525ce7cc43dab4b8ff0d94c46595abb73d4300460fd"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}"
