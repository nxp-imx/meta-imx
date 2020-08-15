# Copyright 2019-2020 NXP

DESCRIPTION = "i.MX vc8000e encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2"

SRC_URI[md5sum] = "b19dcd4b949191559b44b878660b6429"
SRC_URI[sha256sum] = "b29d4f34740a8f53ee415723d5656186407de7b56b6cc04c4c30d9a508c7c2d8"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
