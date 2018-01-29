# Copyright 2017 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[md5sum] = "a2907cddfed011def492b8eb88000b0a"
SRC_URI[sha256sum] = "a86a1600b222ff641327d5debed073e608ffa865228719d2c9a866f9342f2c7d"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
