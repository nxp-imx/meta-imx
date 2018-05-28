# Copyright 2017-2018 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=ab61cab9599935bfe9f700405ef00f28"

SRC_URI[md5sum] = "c9cd8a24da4c64979c447bc027abd711"
SRC_URI[sha256sum] = "19e8713976a22f86c8e8b5765e3eba886575e3d08d0cb8623b5544e2df57af60"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
