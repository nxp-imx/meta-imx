# Copyright 2017-2018 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=5ab1a30d0cd181e3408077727ea5a2db"

SRC_URI[md5sum] = "c70abba59005cdcd7864c30961e17c63"
SRC_URI[sha256sum] = "a0268e23eacaeae7ab3d732db5b3df9e277c20d0665d54609c6c3240f71eecab"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
