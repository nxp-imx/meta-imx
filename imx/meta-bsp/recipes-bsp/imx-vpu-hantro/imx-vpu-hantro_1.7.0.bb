# Copyright 2017-2018 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=75abe2fa1d16ca79f87cde926f05f72d"

SRC_URI[md5sum] = "848a5f41696c1c7fb94e269d0a0797c6"
SRC_URI[sha256sum] = "2a6907eac29020db70a2ccdf6e66a9c95c7c0cee373d9d5dab97e9e1eff2d84e"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
