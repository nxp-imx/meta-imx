# Copyright 2017 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[md5sum] = "fcdf2b99c60a6324d2e8bec035dd85d1"
SRC_URI[sha256sum] = "d80a97078d879996fae955fb0d118fba48db7fa5f1294f88ed113217e6576ba0"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
