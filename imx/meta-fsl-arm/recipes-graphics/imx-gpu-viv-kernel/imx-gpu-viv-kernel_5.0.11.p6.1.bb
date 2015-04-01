# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "2c4d5d936cc98b9f6e9ae8755a81d399"
SRC_URI[sha256sum] = "da64ed87fa8064f7c39b1e9cdc0f8ae9eba74790ce2a80a233f56d83575b3eaf"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.1', '5.0.11.p6.1-alpha')}"
