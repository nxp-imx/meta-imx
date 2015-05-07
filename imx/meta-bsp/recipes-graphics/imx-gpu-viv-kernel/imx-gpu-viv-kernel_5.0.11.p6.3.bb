# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "5dae9712fca65ebbf667908f18a2e014"
SRC_URI[sha256sum] = "01532f139361ba9e19c4b7b790714f4127d59c8e8a1c9e7a36e6107057d19fd3"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}"
