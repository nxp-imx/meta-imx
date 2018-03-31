# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2018 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

PACKAGECONFIG_remove_imxvpuamphion = "vpu"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bd2df2910a2234bf6f419b7d2f531a3"

SRC_URI[md5sum] = "443a5c03d2be2b653875bbbee624f417"
SRC_URI[sha256sum] = "0ec9bbd0c4149058fca4b9b4d2f5411209913b791d176227d49c36d4611f50f1"

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"
