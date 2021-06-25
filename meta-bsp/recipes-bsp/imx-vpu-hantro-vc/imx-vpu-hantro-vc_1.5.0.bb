# Copyright 2019-2021 NXP

DESCRIPTION = "i.MX vc8000e encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=b3b0bab6ff55420d043cf1652c52d788"

SRC_URI[md5sum] = "b095a73bba00e3b4b49c018fa1456196"
SRC_URI[sha256sum] = "b54e896dae8c5d328132d382dec30228255217fe1b84c48830198cf00eaaa3d5"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
