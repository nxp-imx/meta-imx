# Copyright 2017 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[md5sum] = "94cca4d31a8683320e915015f06b8fca"
SRC_URI[sha256sum] = "e3d47bd677ce7034dda51fb99212f78b9cd83f8d169655b51fbdfebf4cda5d42"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
