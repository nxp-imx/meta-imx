# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "7d823c0d576020e7a60bb850d5a33b65"
SRC_URI[sha256sum] = "3be8e2cf8f1ed3fa2377ab7f2fbb4f47b1287b53aa2d6c19652deff65dc83f25"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}"
