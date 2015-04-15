# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "0205f9b0ccfca9e43afb572bdd52fa08"
SRC_URI[sha256sum] = "3a6430206a5c59006bdb74af3f5bb2e4b9370bf9ab3562de714818c360ea2ffb"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}"
