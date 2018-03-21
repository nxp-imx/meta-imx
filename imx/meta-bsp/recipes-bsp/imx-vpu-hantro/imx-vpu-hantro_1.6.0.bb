# Copyright 2017 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[md5sum] = "09ec833586afb5f194ce0202da925ed6"
SRC_URI[sha256sum] = "cbc648e41f005aad209f74c9e5dd346138dca12efeb7b27e471de7474c4da302"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
