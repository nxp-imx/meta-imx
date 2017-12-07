# Copyright 2017 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[md5sum] = "05b002985398cbc77e42d69105fc35ae"
SRC_URI[sha256sum] = "74cdaa205f679925f83b626bc6b8dc3547b38fb7af4e62b08c5fde2ea21b9ae8"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
