# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "26265c6b0046f6b507368d624a1d02e3"
SRC_URI[sha256sum] = "89cbdf6c4adae92ffce5c833e9faecc0b1dc60a20dea19f6971accc79757ebb3"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.1', '5.0.11.p6.1-alpha')}"
