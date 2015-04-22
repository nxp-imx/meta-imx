# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "a36a992807b00dbd0746e552b55809c0"
SRC_URI[sha256sum] = "75286ff8bf5d2608cfafd77a669ce1b8806e69f95afcc232cd2950537ade152f"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}"
