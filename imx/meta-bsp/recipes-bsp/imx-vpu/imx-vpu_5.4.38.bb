# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017 NXP

require recipes-bsp/imx-vpu/imx-vpu.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

PE = "1"

SRC_URI[md5sum] = "30653aea41befd81c7407521d10ae869"
SRC_URI[sha256sum] = "c93e114ae3708ddd86ab0042cf6334f0c1430b49b6d5670f213930268cb00df3"

# Compatible only for i.MX with Chips&Media VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpucnm = "${MACHINE}"
