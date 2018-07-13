# Copyright 2017-2018 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=5ab1a30d0cd181e3408077727ea5a2db"

SRC_URI[md5sum] = "82a223943e473e7345ad8f280deb666e"
SRC_URI[sha256sum] = "582b2ae478fa1a726b5e606c616c7a53a1377cdb06feea947c86b0cbb26635f3"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
