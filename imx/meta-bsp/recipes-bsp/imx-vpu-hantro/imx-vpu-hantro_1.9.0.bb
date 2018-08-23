# Copyright 2017-2018 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=5ab1a30d0cd181e3408077727ea5a2db"

SRC_URI[md5sum] = "38140d92290620a7a6485d66c97287ae"
SRC_URI[sha256sum] = "1e2b17e67d4acd588ad257a41ef131971685aa594cb96bab755a7b97b9feb4bb"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
