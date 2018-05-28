# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2018 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

PACKAGECONFIG_remove_imxvpuamphion = "vpu"

LIC_FILES_CHKSUM = "file://COPYING;md5=ab61cab9599935bfe9f700405ef00f28"

SRC_URI[md5sum] = "2dc97f4088103a9209b9d3481836b1de"
SRC_URI[sha256sum] = "32f2c7e582fbd71038eae06158fff4c2c31d9dca2ff7ac3fd86cbb1128f465fc"

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"
