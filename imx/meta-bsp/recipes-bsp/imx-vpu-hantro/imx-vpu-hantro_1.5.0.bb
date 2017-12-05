# Copyright 2017 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[md5sum] = "1a987cf13d6e4496deb17cf23571eccb"
SRC_URI[sha256sum] = "8eeb16c904587998d64bc041b5f0ef56bdf1bc4d78992e4f1eef42e781919dec"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
