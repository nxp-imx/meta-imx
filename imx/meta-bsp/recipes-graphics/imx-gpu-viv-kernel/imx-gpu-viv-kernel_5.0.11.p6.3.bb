# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "5e5c916dc0c4ed3910dcaaefead9151c"
SRC_URI[sha256sum] = "bd59aa9f86ea858e497336aa04176fd2bfff954a0a30e83abf31b033f6edd604"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}"
