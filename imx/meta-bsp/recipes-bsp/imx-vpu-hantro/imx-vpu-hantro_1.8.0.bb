# Copyright 2017-2018 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=ab61cab9599935bfe9f700405ef00f28"

SRC_URI[md5sum] = "ec4ce729c4410a975744b58ffc4bb827"
SRC_URI[sha256sum] = "7b09ef668ba9ad97a8b6788496f751dd02243ae759a4cfea99450154f5718040"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
