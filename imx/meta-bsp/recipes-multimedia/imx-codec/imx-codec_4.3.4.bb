# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

PACKAGECONFIG_remove_imxvpuamphion = "vpu"

LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[md5sum] = "de2ed0692cdb9d0d50b191ae78fbb738"
SRC_URI[sha256sum] = "c0f92d14b6641f709402d166fcff0574637eb29cfc9fa5e7b985b93a970dae94"

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"
