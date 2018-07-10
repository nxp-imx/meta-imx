# Copyright 2017-2018 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=5ab1a30d0cd181e3408077727ea5a2db"

SRC_URI[md5sum] = "d23836857cefe9dc0ec1f49199fe78e2"
SRC_URI[sha256sum] = "39e528f5b65433dd070ccf62272c96e82a799bbe1863a0a501118962d5de1b26"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
