# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "e2e15f48215452dd622372963f647f18"
SRC_URI[sha256sum] = "cfb107cab0be1f1f45d8ee5e55514c0792bad93ef19c2f8090fa1a6904f121fb"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.1', '5.0.11.p6.1-alpha')}"
