# Copyright 2017-2018 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=5ab1a30d0cd181e3408077727ea5a2db"

SRC_URI[md5sum] = "777552866bab1b78a27dd63cbfbc95dc"
SRC_URI[sha256sum] = "8542dc377cdb4d683beee607bbf0f3b64c6a38a7f39e9d8714684700625c0d60"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
