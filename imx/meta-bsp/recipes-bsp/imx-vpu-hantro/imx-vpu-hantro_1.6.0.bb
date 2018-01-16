# Copyright 2017 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[md5sum] = "e19e97e85478f5b2b39d80613901af07"
SRC_URI[sha256sum] = "2f0e42e752a209e3c33991d7b08f726eb6317ec3e494aa73f935100670509c71"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
