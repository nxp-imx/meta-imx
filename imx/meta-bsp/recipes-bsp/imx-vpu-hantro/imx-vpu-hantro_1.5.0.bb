# Copyright 2017 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[md5sum] = "051d174e83e121e22c854853fbbc0c3c"
SRC_URI[sha256sum] = "094e3392a62339074ff513ff52cee7041432c7bd4a5ccab05f9f080cac9251a8"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
