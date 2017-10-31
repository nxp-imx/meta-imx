# Copyright 2017 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[md5sum] = "f3e257a2c3f176a449af2077941fc117"
SRC_URI[sha256sum] = "e9a5cf9497e209b930039a7a26c88f44edaf133788db48e043c4fff536219ef5"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
