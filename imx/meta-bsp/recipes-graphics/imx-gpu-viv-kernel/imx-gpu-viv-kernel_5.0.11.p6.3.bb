# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "ba3edcdaf6a662a46f514a3daac84939"
SRC_URI[sha256sum] = "1254ae3773052aba55b294c25192924ff102986e59c1944eeb6347cb521ee8d2"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}"
