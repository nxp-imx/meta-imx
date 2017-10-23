# Copyright 2017 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[md5sum] = "fdb1bc7bc5376b9e1209b7a7bc657f27"
SRC_URI[sha256sum] = "5027cdc979f443ae4d6af9d06357e319c8de5fe8531548b1258eb38d9627f4b5"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
