# Copyright 2019-2020 NXP

DESCRIPTION = "i.MX vc8000e encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d"

SRC_URI[md5sum] = "a0144a4f62fba97cecf7a5147a14de9f"
SRC_URI[sha256sum] = "d7cb56eaab989aecac1b44913736255f22e8244eea5ed50acac9d1df99860714"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
