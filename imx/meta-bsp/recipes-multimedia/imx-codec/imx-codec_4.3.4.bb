# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

PACKAGECONFIG_remove_imxvpuamphion = "vpu"

LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[md5sum] = "1c92b748441297263729c419fd89c8a7"
SRC_URI[sha256sum] = "678abf585b8533ebca98a14802e96ed5dc3589b66ef86da6d34d5d9d9a7efa86"

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"
