# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "da0978896576dacdbbde14254797bd82"
SRC_URI[sha256sum] = "b7dc71edb6e26673560b3926afef01f8f7260c577252e5a8175a0f715117aa72"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}"
