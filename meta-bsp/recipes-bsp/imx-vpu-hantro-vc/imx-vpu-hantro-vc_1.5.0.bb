# Copyright 2019-2021 NXP

DESCRIPTION = "i.MX vc8000e encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=f35df765ff17e69043ea21f350e3229c"

SRC_URI[md5sum] = "d187688337319746fadaef6981a21d5a"
SRC_URI[sha256sum] = "cc1bfb8ea1e830d01b910207139bb3060f2ed1a07d149ab85cf4e461f08b472e"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
