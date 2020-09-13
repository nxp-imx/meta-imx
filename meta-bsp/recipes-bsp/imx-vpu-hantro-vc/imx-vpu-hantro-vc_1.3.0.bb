# Copyright 2019-2020 NXP

DESCRIPTION = "i.MX vc8000e encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143"

SRC_URI[md5sum] = "e5d68203329887ab5ba8c0de9d29db9e"
SRC_URI[sha256sum] = "36df348d93bb7865e8571773ce32155332435a427a3b3fd2ebcfa15583d7869e"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
