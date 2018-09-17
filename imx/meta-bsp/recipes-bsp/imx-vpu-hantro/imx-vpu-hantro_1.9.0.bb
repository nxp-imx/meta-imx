# Copyright 2017-2018 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=5ab1a30d0cd181e3408077727ea5a2db"

SRC_URI[md5sum] = "a062e8063367ca519158130f92f4e63b"
SRC_URI[sha256sum] = "77222808bea52c33f6450b247b69c7850dbfb773158ddc6aa4579fd414b2ea09"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
