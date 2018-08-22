# Copyright 2017-2018 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=5ab1a30d0cd181e3408077727ea5a2db"

SRC_URI[md5sum] = "1165331cc4a549278bd8b04743a98404"
SRC_URI[sha256sum] = "6ffbdcd3a78b6a3f1bbbd61f6b9345aefe8a030dddbc399d02198fd843821bf0"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
