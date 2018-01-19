# Copyright 2017 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[md5sum] = "d36b4db41dfc738fc55d350c4bc78ebd"
SRC_URI[sha256sum] = "088b606b7f071b01e2fe959cb19e8feb9a827b4ee789edefceaa93d55346b0e6"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
