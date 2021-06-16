# Copyright 2019-2021 NXP

DESCRIPTION = "i.MX vc8000e encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=417b82f17fc02b88125331ed312f6f1b"

SRC_URI[md5sum] = "b5270450ba2da5b7468b67ae8c0bcdca"
SRC_URI[sha256sum] = "d5efae484c4271c098286d007590d6bf40c272d4f35702ff65625f2362715ab3"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
