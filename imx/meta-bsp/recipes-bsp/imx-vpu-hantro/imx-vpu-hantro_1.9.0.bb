# Copyright 2017-2018 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=5ab1a30d0cd181e3408077727ea5a2db"

SRC_URI[md5sum] = "8652f6ca294da8a98345947117840e06"
SRC_URI[sha256sum] = "143362f1ff064862e7fd3eec1de58b22732814057dcb8b18ddc73e08c9a83ad1"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
