# Copyright 2019-2020 NXP

DESCRIPTION = "i.MX vc8000e encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2"

SRC_URI[md5sum] = "d2b7c0cfdb380e5a65a94251c2437a34"
SRC_URI[sha256sum] = "10a7f60964feb9641291815876fb8110dfec603c6451ed9b9c7fe57c23afd10e"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
