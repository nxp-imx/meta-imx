# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

PACKAGECONFIG_remove_imxvpuamphion = "vpu"

LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[md5sum] = "5453c5b046f8b1475b616b321772bfba"
SRC_URI[sha256sum] = "c77ac4622455eef015f0a772dda4a8139262d3daee1d3cd2de1a9cd0a6f4cedc"

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"
