# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "2f652bfd633f1cb53a7770cb8326948c"
SRC_URI[sha256sum] = "6ef541eb286cb323df21af7fece8cae603ed528010d68aba640a894bcb87690e"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}"
