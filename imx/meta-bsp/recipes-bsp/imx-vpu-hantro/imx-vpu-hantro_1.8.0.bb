# Copyright 2017-2018 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=ab61cab9599935bfe9f700405ef00f28"

SRC_URI[md5sum] = "4a2c7d5811dab341483f5c61e2455bd8"
SRC_URI[sha256sum] = "f93d9ecc86a1edeaa95a158ac0d55040dab4a873a42a595abea6cfc066ba65cf"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
