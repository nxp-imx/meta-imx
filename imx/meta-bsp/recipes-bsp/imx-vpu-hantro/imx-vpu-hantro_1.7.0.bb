# Copyright 2017 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[md5sum] = "c5827cb4e84032e2354edbf61996502f"
SRC_URI[sha256sum] = "6aa5fbbd0caff4eee3fc5e4e4acd6ee881e8026c39f5d63b78985767a147a11c"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
