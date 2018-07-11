# Copyright 2017-2018 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=5ab1a30d0cd181e3408077727ea5a2db"

SRC_URI[md5sum] = "ad1accb23276e365d277ee4dc7620207"
SRC_URI[sha256sum] = "be756122e82450fab51d56cbe3400b1fd12d1fdda387d4e6f791895c256ba083"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
