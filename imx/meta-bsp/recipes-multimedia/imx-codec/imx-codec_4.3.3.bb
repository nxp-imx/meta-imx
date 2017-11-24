# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

PACKAGECONFIG_remove_imxvpuamphion = "vpu"

LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[md5sum] = "da842f6790dff1f72f3d4c76e50c56bc"
SRC_URI[sha256sum] = "9ce4e9088e9e4d3efc52dfb66061f25eeab0e104aa940ae9e4a8c311ecdc16dd"

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"
