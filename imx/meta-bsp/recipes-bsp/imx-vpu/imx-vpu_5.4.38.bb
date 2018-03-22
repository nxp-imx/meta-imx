# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2018 NXP

require recipes-bsp/imx-vpu/imx-vpu.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

PE = "1"

SRC_URI[md5sum] = "0b8e45decce2933f648c0faeb7278a0e"
SRC_URI[sha256sum] = "5c757e7c1b0e9144ae6c8bbdbdc07dcbda65ff9e0b8f9ea628e11d63a1b2eaf4"

# Compatible only for i.MX with Chips&Media VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpucnm = "${MACHINE}"
