# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "2c197e2d82fe2fd94aaae2b569861d3d"
SRC_URI[sha256sum] = "639972fc9b041cb0fa83650318eab2bbd41abaca431abd1bdc6d36a21e33c4d6"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}"
