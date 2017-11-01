# Copyright 2017 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[md5sum] = "a15056a099b0d9c174fd07820779bf68"
SRC_URI[sha256sum] = "aafd4fd417701569b2a4ed17819d2b8a283d7850bfb8af05ed1153a492e8307a"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
