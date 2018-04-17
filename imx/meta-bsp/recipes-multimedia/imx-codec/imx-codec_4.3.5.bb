# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2018 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

PACKAGECONFIG_remove_imxvpuamphion = "vpu"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bd2df2910a2234bf6f419b7d2f531a3"

SRC_URI[md5sum] = "ea080472c3fe5f5ae4760ba16c8ea6c5"
SRC_URI[sha256sum] = "6bb54f91c3ca18567e14d95d3858022dc9be00dc86e9edfdb544d1240a3b2b04"

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"
