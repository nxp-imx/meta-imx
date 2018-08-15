# Copyright 2017-2018 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=5ab1a30d0cd181e3408077727ea5a2db"

SRC_URI[md5sum] = "e49b687fe786203360faf033c856ca34"
SRC_URI[sha256sum] = "410cdda2f21a9424eb509ea180840f056ec8cf4ec49960f649c8ffb03a65e05c"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
