# Copyright 2019-2021 NXP

DESCRIPTION = "i.MX vc8000e encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=e565271ec9a80ce47abbddc4bffe56fa"

SRC_URI[md5sum] = "614c89613be60996c3a1cc7875ebba23"
SRC_URI[sha256sum] = "2c5745d6b98696680d2775fa3c26762347d9f2a6e80e7918a51d8619497dbdb8"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
