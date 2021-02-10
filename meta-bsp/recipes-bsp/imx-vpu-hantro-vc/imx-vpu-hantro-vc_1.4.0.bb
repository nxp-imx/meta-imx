# Copyright 2019-2021 NXP

DESCRIPTION = "i.MX vc8000e encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=a632fefd1c359980434f9389833cab3a"

SRC_URI[md5sum] = "55e4571535f2f0888bcff82b51f3c76d"
SRC_URI[sha256sum] = "8d7801e1f881f237da02097cdf594fdd12e0edd5346cca17d0361f67e5a5e4ce"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
