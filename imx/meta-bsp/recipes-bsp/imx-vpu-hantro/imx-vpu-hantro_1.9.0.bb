# Copyright 2017-2018 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=5ab1a30d0cd181e3408077727ea5a2db"

SRC_URI[md5sum] = "4310849bc36fe97aa3600927956d0e9a"
SRC_URI[sha256sum] = "3d154861035bb44fa62eedbb1de85ac6576ea4f53593199ece06aa84462da6c8"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
