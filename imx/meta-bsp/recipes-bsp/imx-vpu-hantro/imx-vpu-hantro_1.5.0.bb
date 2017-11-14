# Copyright 2017 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[md5sum] = "271023fd82c28ab55ca0682bd3e0f821"
SRC_URI[sha256sum] = "630e7cf6a52c341bd446d99fc7dc633179014843aa36058cf5cc3c874be2b564"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
