# Copyright 2017 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[md5sum] = "8001f0fcff12c874f756f8997ad73ad2"
SRC_URI[sha256sum] = "12923a470e47dd44de4c7a696fa4d6869f450da673920738124d88b641dbb087"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
