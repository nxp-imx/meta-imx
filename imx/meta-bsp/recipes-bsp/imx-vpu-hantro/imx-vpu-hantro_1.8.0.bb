# Copyright 2017-2018 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=5ab1a30d0cd181e3408077727ea5a2db"

SRC_URI[md5sum] = "240c5c72b251c68270ea201c39c73d3d"
SRC_URI[sha256sum] = "f451703a2634b56a5e81cb69a9c1252def1cec3165c3316aa9f2a338a26f36d7"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
