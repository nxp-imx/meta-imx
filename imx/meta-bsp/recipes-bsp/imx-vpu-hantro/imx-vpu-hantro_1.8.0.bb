# Copyright 2017-2018 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=ab61cab9599935bfe9f700405ef00f28"

SRC_URI[md5sum] = "7d2c8c507765fdfb8718bed3944388b0"
SRC_URI[sha256sum] = "35d6839362b0478fac547c60fba7b081ce41f4a45654489dd7c30788871cd9a3"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
