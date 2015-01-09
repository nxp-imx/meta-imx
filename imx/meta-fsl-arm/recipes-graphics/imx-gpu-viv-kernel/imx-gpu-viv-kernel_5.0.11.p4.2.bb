# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
          "
SRC_URI[md5sum] = "13da2d9e482a7d2cb71b24e5a395a6a2"
SRC_URI[sha256sum] = "ba7778c32b5a08b1e3e034a0b8345e151366c934109b556b2072e905e3064426"

S = "${WORKDIR}/${PN}-${PV}"
