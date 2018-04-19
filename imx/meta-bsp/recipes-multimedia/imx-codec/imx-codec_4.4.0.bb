# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2018 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

PACKAGECONFIG_remove_imxvpuamphion = "vpu"

LIC_FILES_CHKSUM = "file://COPYING;md5=75abe2fa1d16ca79f87cde926f05f72d"

SRC_URI[md5sum] = "bb9031438ab2d271322bdeed51b7b119"
SRC_URI[sha256sum] = "b3eeb5dd03a73c5fb872d18562ec284052b3e1462246835ce0cd2d7eddf20498"

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"
