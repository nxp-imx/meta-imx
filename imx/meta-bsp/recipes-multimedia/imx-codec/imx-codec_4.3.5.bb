# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2018 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

PACKAGECONFIG_remove_imxvpuamphion = "vpu"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bd2df2910a2234bf6f419b7d2f531a3"

SRC_URI[md5sum] = "d0e0d27737cc6b8c8bba39bf9c4388a8"
SRC_URI[sha256sum] = "23dda1e09e9c207cde26414153b4aaac19d11ac64fa991c47cfc0e2824ba333e"

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"
