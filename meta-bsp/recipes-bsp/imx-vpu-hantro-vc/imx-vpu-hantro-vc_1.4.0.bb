# Copyright 2019-2021 NXP

DESCRIPTION = "i.MX vc8000e encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=85d06b38f17b935ca11784d67075b846"

SRC_URI[md5sum] = "0f559282bfda0996fa763383d37955d2"
SRC_URI[sha256sum] = "e2931c557cca31b10ce51d196eefa2437535ca7b5dd91069fbd815c707659681"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
