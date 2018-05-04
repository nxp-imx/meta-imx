# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2018 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

PACKAGECONFIG_remove_imxvpuamphion = "vpu"

LIC_FILES_CHKSUM = "file://COPYING;md5=75abe2fa1d16ca79f87cde926f05f72d"

SRC_URI[md5sum] = "b1e0576e479a0015b0e4c79025de8adb"
SRC_URI[sha256sum] = "a92a1504350f0114270e7e85dcab3b6eb8cd625fe8e4c033867e23079156a429"

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"
