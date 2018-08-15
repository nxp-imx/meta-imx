# Copyright 2017-2018 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=5ab1a30d0cd181e3408077727ea5a2db"

SRC_URI[md5sum] = "226aaa8b85567364d4a8c0f968af6115"
SRC_URI[sha256sum] = "a3e94094e38ada6e59fb6490f487e38fe40e8bd43d0619f12e00e8d8e63603ce"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
