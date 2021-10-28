# Copyright 2019-2021 NXP

DESCRIPTION = "i.MX vc8000e encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=03bcadc8dc0a788f66ca9e2b89f56c6f"

SRC_URI[md5sum] = "145cd7f33b996cd007bf51d5ebe1bf78"
SRC_URI[sha256sum] = "f157b381cf9a7a2ca3af1c04367a0093b0f03b0248a252778126bb82c767b37c"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
