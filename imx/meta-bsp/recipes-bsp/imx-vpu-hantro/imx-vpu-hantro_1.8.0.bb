# Copyright 2017-2018 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=5ab1a30d0cd181e3408077727ea5a2db"

SRC_URI[md5sum] = "c33ee2bb77ac32a431097d204f92d936"
SRC_URI[sha256sum] = "eb53e49fadc9d59537819dd6040457865f933ecc4415d1a24ca92451daace9e1"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
