# Copyright 2017 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[md5sum] = "e6341742a3caecbba7ff108aaf7d9ac4"
SRC_URI[sha256sum] = "327afcb685efcaae322508c961b29d1df7bb63156e6b4c8606a8525354c60b5f"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
