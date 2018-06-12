# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2018 NXP

require recipes-bsp/imx-vpu/imx-vpu.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=75abe2fa1d16ca79f87cde926f05f72d"

PE = "1"

SRC_URI[md5sum] = "521d5f839829f8d1f2a6a0e60270243e"
SRC_URI[sha256sum] = "34bed0ddf6c797f444bddfa5d5495adc751ff268b6431d8beb48129c89c9e47f"

# Compatible only for i.MX with Chips&Media VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpucnm = "${MACHINE}"
