# Copyright 2017-2018 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=5ab1a30d0cd181e3408077727ea5a2db"

SRC_URI[md5sum] = "1a7882e4fa4fc25dbb464975b22a9f52"
SRC_URI[sha256sum] = "f22680e818eeec5f4de1291ded03f62d3ab21d487a253f6dc5d4f7652a687095"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
