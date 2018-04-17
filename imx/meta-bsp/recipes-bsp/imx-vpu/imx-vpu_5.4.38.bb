# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2018 NXP

require recipes-bsp/imx-vpu/imx-vpu.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=75abe2fa1d16ca79f87cde926f05f72d"

PE = "1"

SRC_URI[md5sum] = "4c33584308033c2660fdfd0463abd6c2"
SRC_URI[sha256sum] = "458a0ad2560e8db86012a9b347e3c937a4ccbc7541343a4a3e9b820c7ae7a2cc"

# Compatible only for i.MX with Chips&Media VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpucnm = "${MACHINE}"
