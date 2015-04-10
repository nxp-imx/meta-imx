# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "c35195f18d5ddd24a64062a2a25e9128"
SRC_URI[sha256sum] = "6aabf0e56d8ef9010441328b50d074f930300c913d0fb8920624e98425b56b87"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.2', '5.0.11.p6.2-alpha')}"
