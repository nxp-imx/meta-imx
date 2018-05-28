# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2018 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

PACKAGECONFIG_remove_imxvpuamphion = "vpu"

LIC_FILES_CHKSUM = "file://COPYING;md5=ab61cab9599935bfe9f700405ef00f28"

SRC_URI[md5sum] = "d276ce3a17fd83f25e2f774a1b49beac"
SRC_URI[sha256sum] = "bc327f5405bf3bf2220e92b3fc2950730bf17d2dabffa61a8e7386d277700176"

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"
