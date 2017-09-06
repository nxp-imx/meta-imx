# Copyright 2017 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[md5sum] = "b2c798addd6176885e4efcfab7c17f11"
SRC_URI[sha256sum] = "cf6578025e89b14c5f0a4515328d66de25226ae0ea45552d322f8037799ad709"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
