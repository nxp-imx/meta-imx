# Copyright 2017 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[md5sum] = "09e455d1148c68bb4cb17c894166f42c"
SRC_URI[sha256sum] = "cd3f86295a66344a09835b89d4c787b7ab001736a7f973054e516f943bdc3346"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
