# Copyright 2017 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[md5sum] = "01b67545af4e16423e17eb896eed85ba"
SRC_URI[sha256sum] = "3d57e3fc7c0160d19b11068b8eb528e0fb080fee6ea393a0522663f4d65fe8c4"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
