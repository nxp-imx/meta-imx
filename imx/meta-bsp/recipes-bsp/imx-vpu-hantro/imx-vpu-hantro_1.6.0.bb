# Copyright 2017 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[md5sum] = "4993d0595000704517f02ee0107e6b49"
SRC_URI[sha256sum] = "af892c7a64dea41ebecde2e30ebf6427ceaa7c2cad5204dd59a10cad9ef90b14"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
