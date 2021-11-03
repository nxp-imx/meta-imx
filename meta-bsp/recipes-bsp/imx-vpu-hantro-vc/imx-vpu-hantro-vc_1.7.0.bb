# Copyright 2019-2021 NXP

DESCRIPTION = "i.MX vc8000e encoder library for Kenrel 5.15"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=03bcadc8dc0a788f66ca9e2b89f56c6f"

SRC_URI[md5sum] = "47ea15d1b56bc15ac6b0e2c5c5ff00c9"
SRC_URI[sha256sum] = "2577c9eb16a4c1228d38b0d76321c81bece2849c185376c51233cab9e03a4c12"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
