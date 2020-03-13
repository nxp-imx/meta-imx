# Copyright 2019-2020 NXP

DESCRIPTION = "i.MX vc8000e encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=228c72f2a91452b8a03c4cab30f30ef9"

SRC_URI[md5sum] = "afe352465110b3ee14c61200948ed806"
SRC_URI[sha256sum] = "6cdc9b3df0d8f021bc002e88a5a30a392833145328e65c28ced8535dd1e939bb"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
