# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

PACKAGECONFIG_remove_imxvpuamphion = "vpu"

LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[md5sum] = "4d70c9095b291be7b587932a46fc5244"
SRC_URI[sha256sum] = "1fc6fc014442513135b5eaaa7daa33a0c2b4261d7f1326d201962d6e5d85b3bb"

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"
