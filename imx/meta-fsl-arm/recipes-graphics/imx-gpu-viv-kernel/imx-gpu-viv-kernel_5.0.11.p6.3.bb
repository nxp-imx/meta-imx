# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "21dbcea0fae32d51bda885bf981a33a6"
SRC_URI[sha256sum] = "5ceecaa2f6656f64207f184db94e0224b37dc29d81d779f6c645621faf986922"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}"
