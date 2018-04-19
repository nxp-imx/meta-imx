# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2018 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

PACKAGECONFIG_remove_imxvpuamphion = "vpu"

LIC_FILES_CHKSUM = "file://COPYING;md5=75abe2fa1d16ca79f87cde926f05f72d"

SRC_URI[md5sum] = "76df7c50320c9bd364d1f73da3c389c2"
SRC_URI[sha256sum] = "1e4fdd018b8d70685e39478b9731b8285c00f5722f531f5264f309fb259d4bb6"

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"
