# Copyright 2017 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[md5sum] = "28a308ecd4822ea6065f368d79ee4a0c"
SRC_URI[sha256sum] = "586602bbf3115d813177240f84ab8f648986d73c9f1cb61547215f3d874bd1e4"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
