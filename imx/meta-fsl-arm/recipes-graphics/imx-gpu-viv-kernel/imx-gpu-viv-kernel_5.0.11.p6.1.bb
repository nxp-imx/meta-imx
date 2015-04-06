# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "bb8ef8c8f337db294112316cc5d7c471"
SRC_URI[sha256sum] = "8873c821640a815bc24867309de4d2f4d09a321cc9635473d37df0bbd6d2e7de"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.1', '5.0.11.p6.1-alpha')}"
