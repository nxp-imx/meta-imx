# Copyright 2017-2018 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=5ab1a30d0cd181e3408077727ea5a2db"

SRC_URI[md5sum] = "d10a3150310d9d50cbe80ee86dbce1da"
SRC_URI[sha256sum] = "5ab038eaf7187863bbc10569957c5f0fe768618a7cbdbbb1b74f3157b92182c1"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
