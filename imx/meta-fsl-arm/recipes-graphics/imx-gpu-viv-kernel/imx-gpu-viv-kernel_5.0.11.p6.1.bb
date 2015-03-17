# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "adddb0debb9927245d627c2763b1c54e"
SRC_URI[sha256sum] = "89a219521fc5ea838e672d50ff8b84627fbb837447693d193248ca858e0eebda"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.1', '5.0.11.p6.1-alpha')}"
