# Copyright 2019-2021 NXP

DESCRIPTION = "i.MX vc8000e encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=a632fefd1c359980434f9389833cab3a"

SRC_URI[md5sum] = "56aa6905f7e6b96978410856f3ca9ca0"
SRC_URI[sha256sum] = "39734136f078838b19fdabf14217ddb40903b87592e87207423777768b9b76d3"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
