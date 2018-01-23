# Copyright 2017 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[md5sum] = "f7f4bbd73f81433e124b094eb61b9208"
SRC_URI[sha256sum] = "038ba072f2e024be2dec1af76e6b6b711b201eb19ce154694138a3b53924b4ac"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
