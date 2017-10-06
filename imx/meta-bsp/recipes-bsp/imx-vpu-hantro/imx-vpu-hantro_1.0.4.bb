# Copyright 2017 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[md5sum] = "85d6cd6a8efc29d69c901b2fe9c4ee4f"
SRC_URI[sha256sum] = "3338154eb9e73079ccc82a6f6fea12a2f979cb1a06fe191800b6067422ef231d"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
