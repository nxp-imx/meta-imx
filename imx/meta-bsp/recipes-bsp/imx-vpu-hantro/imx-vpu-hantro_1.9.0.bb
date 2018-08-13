# Copyright 2017-2018 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=5ab1a30d0cd181e3408077727ea5a2db"

SRC_URI[md5sum] = "42ac34b2d2b8f410faece52b33364729"
SRC_URI[sha256sum] = "0ece66c17247cf12f65b4b2e88feae5089f17339fdc9d4e782274e01afcaf62e"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
