# Copyright 2017-2018 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=75abe2fa1d16ca79f87cde926f05f72d"

SRC_URI[md5sum] = "bf402883916f3a40b26a65903c3d0516"
SRC_URI[sha256sum] = "230d74bc6c20f1b5a8e7f42ecdf6e734d3d18f3a532c48843a1962113bdb4e0a"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
