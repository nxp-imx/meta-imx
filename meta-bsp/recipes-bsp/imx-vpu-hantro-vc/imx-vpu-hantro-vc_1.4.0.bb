# Copyright 2019-2021 NXP

DESCRIPTION = "i.MX vc8000e encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=3c3fe2b904fd694f28d2f646ee16dddb"

SRC_URI[md5sum] = "4c3914b2a138f8e8260fd7d17a61e903"
SRC_URI[sha256sum] = "d2f67fc66ce01abead6a61d0a84d9a46a300de67336af678d0a4142c62156894"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
