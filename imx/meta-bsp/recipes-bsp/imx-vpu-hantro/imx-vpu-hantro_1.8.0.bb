# Copyright 2017-2018 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=ab61cab9599935bfe9f700405ef00f28"

SRC_URI[md5sum] = "673d949ca6689e197d828001d24c9eee"
SRC_URI[sha256sum] = "111c595dd55327cd79d73a73aff8c8a4cb676ff7acc088bbc77163193fa7aa90"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
