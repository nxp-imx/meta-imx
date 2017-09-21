# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

PACKAGECONFIG_remove_imxvpuamphion = "vpu"

LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[md5sum] = "aaefb3838fd28afd10476dc2ba2cb13d"
SRC_URI[sha256sum] = "e67dbcfe4e66f576b45d898003256b8363027f8c42c3a279879165b4874ce339"

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"
