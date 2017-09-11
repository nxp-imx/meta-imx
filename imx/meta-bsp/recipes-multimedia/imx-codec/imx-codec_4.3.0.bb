# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

PACKAGECONFIG_remove_imxvpuamphion = "vpu"

LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[md5sum] = "cb70c655c2ce9642149e6ffca484c602"
SRC_URI[sha256sum] = "005e6c05149c0d968edbca87300508b772228a1b420a23e92224b1d3d9a7a219"

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"
