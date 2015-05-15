# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "0dda6940aafcabde8fd656daa2dda17e"
SRC_URI[sha256sum] = "ea236ca3d45fb1d36f8bec77bbc6f16a1687dce23e20209eba6f31dfa5b16559"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}"
