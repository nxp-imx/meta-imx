# Copyright 2017-2018 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=ab61cab9599935bfe9f700405ef00f28"

SRC_URI[md5sum] = "a1e05ab30ec881c22a70b4695d70fff4"
SRC_URI[sha256sum] = "77b5339dcefe486ebefa64af064ed0093446ef7afe86742183c97e0a0c5295d4"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
