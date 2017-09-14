# Copyright 2017 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[md5sum] = "8c13d6c7e9b38eba0224bc227ff0213d"
SRC_URI[sha256sum] = "cd9f1161b66acc5943af20b05796f2f59dc49f461174e2dfe9250a8a62421695"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
