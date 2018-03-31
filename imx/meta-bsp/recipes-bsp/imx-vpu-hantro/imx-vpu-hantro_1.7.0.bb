# Copyright 2017-2018 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=6bd2df2910a2234bf6f419b7d2f531a3"

SRC_URI[md5sum] = "6b206baf15525acd5324d48028c68ad6"
SRC_URI[sha256sum] = "23b7bb5d57975629dd5f1b227a00010981c09c11b3dd853d6a2b791bb5f694b3"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
