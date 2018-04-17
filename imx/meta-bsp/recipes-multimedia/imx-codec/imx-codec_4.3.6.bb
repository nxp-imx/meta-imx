# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2018 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

PACKAGECONFIG_remove_imxvpuamphion = "vpu"

LIC_FILES_CHKSUM = "file://COPYING;md5=75abe2fa1d16ca79f87cde926f05f72d"

SRC_URI[md5sum] = "a5da9a5ac371c65174d2c53892c8cc9c"
SRC_URI[sha256sum] = "4d2fe7a2c34068615c58ef4013da0fb527bf721ea395344cafa347f97f30d094"

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"
