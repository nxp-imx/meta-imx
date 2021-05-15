# Copyright 2019-2021 NXP

DESCRIPTION = "i.MX vc8000e encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=3c3fe2b904fd694f28d2f646ee16dddb"

SRC_URI[md5sum] = "0f559282bfda0996fa763383d37955d2"
SRC_URI[sha256sum] = "e2931c557cca31b10ce51d196eefa2437535ca7b5dd91069fbd815c707659681"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
