# Copyright 2017-2018 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=5ab1a30d0cd181e3408077727ea5a2db"

SRC_URI[md5sum] = "dec622a18a3a3c535fff74c4597f07b7"
SRC_URI[sha256sum] = "2f905f998ce134d4dbeba5e5404af9855b9402c221d104d134f82f1b70329271"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
