# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2018 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

PACKAGECONFIG_remove_imxvpuamphion = "vpu"

LIC_FILES_CHKSUM = "file://COPYING;md5=5ab1a30d0cd181e3408077727ea5a2db"

SRC_URI[md5sum] = "24fc30018e3c1a005cca62b8c399c098"
SRC_URI[sha256sum] = "e905c16df4d255f6f8d9c988e4dbef7ad6b0f3fa5b9c4060254ef9c98f8562c3"

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"
