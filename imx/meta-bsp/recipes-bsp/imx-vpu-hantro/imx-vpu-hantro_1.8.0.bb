# Copyright 2017-2018 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=5ab1a30d0cd181e3408077727ea5a2db"

SRC_URI[md5sum] = "140796ddd6f1be47cffb7e5e2bfe0fb6"
SRC_URI[sha256sum] = "c092a5b0f8897bae54154f58e47b6d2de033da01ee231a8cd779a51bbe962606"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
