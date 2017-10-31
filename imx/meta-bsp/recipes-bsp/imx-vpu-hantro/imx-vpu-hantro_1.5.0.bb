# Copyright 2017 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[md5sum] = "3a7a2cc0e12e269ccd2d391e92a2a3fa"
SRC_URI[sha256sum] = "a7ffac06375159c023c32970f805e57fedfd760a0e2cab8a225d729aa34f9420"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
