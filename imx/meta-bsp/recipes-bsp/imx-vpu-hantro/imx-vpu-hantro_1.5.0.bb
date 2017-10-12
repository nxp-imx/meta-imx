# Copyright 2017 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[md5sum] = "89a788eb0b4c915f30dfdc3cf54a16d1"
SRC_URI[sha256sum] = "b5e32444124e05d76a6ca4e39c9ddab07642b9761902caa23b312dcdd7bd669b"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
