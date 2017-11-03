# Copyright 2017 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[md5sum] = "6020ec68f440f37b0e2e6bdffc34166d"
SRC_URI[sha256sum] = "80fa6365701269760a9c2e443e70f1e67c6573f7fd247f225b8f9fb59caa52d6"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
