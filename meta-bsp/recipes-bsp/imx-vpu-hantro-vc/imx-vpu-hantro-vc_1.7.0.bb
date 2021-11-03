# Copyright 2019-2021 NXP

DESCRIPTION = "i.MX vc8000e encoder library for Kenrel 5.15"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=03bcadc8dc0a788f66ca9e2b89f56c6f"

SRC_URI[md5sum] = "2a6fcf5af36df9c544c87cb5a4bdc350"
SRC_URI[sha256sum] = "eb6922ef6bf7fbda16aae769bbc646849c337954f08077b962a0573b858086a0"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
