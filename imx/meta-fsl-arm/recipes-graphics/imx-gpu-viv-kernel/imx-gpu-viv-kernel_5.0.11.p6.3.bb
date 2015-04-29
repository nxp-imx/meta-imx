# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "7e49684a2bf4df1455b606462cd015fc"
SRC_URI[sha256sum] = "a57e9aef38fa6bdb774a061f20b17d38cd9a367b337b9a1161fcd5ff0f72c715"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}"
