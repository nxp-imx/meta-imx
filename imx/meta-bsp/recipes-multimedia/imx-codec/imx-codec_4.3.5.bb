# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

PACKAGECONFIG_remove_imxvpuamphion = "vpu"

LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[md5sum] = "28215e9c6edb05422353ae959077389b"
SRC_URI[sha256sum] = "1f643b460def3caa47658cc0a159ad1b8af850633780d007193842c33b6f7a98"

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"
