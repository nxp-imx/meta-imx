# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "6d46da80de94e98ee68ab1a75f384b89"
SRC_URI[sha256sum] = "e4b02fc0c9bdbfc7ecc67a0bad0917e788921c8f2444d99bd77daae7f3cd95df"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}"
