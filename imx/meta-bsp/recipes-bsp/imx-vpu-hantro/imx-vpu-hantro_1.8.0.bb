# Copyright 2017-2018 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=5ab1a30d0cd181e3408077727ea5a2db"

SRC_URI[md5sum] = "24cf5345dfbb8e24815f82b259cf8f6f"
SRC_URI[sha256sum] = "7848997626ccdf8554b8fef26ffbe4aa5e52fbe6b90c09fd110e5846842a4f02"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
