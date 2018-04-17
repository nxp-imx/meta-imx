# Copyright 2017-2018 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=75abe2fa1d16ca79f87cde926f05f72d"

SRC_URI[md5sum] = "b85c44818ce259595b5d1621a50cee18"
SRC_URI[sha256sum] = "540572d727981366b7cbf22a0bd46dbf912c2233454fc125d2292c3e9c5a2874"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
