# Copyright 2017-2018 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=5ab1a30d0cd181e3408077727ea5a2db"

SRC_URI[md5sum] = "f3317e35050bfe8c6a286bbfe2b9931c"
SRC_URI[sha256sum] = "af9f13f7ad4f1b446c524c6c9aca71919afb64ab9b3412614ec33c1ee6135c85"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
