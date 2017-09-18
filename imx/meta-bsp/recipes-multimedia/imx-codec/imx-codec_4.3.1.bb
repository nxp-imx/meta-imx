# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

PACKAGECONFIG_remove_imxvpuamphion = "vpu"

LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[md5sum] = "5b2109d6de5e79470cb20d7a93e33035"
SRC_URI[sha256sum] = "dce42857efa27dab92cb3601c55eff33ebeeb06db55218138545fd3d871f7a95"

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"
