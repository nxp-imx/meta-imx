# Copyright 2019-2023 NXP

DESCRIPTION = "i.MX VC8000E encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=db4762b09b6bda63da103963e6e081de"

SRC_URI[md5sum] = "39e5fe29bf42021b95c8e6c2c5b7980f"
SRC_URI[sha256sum] = "84fcefa0619def2f009ca6651c5cffcda57fed29cd7060ef68be48c5d0d7814b"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(mx8mp-nxp-bsp)"
