# Copyright 2019-2021 NXP

DESCRIPTION = "i.MX vc8000e encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=417b82f17fc02b88125331ed312f6f1b"

SRC_URI[md5sum] = "c237964d4f97f03bea21b1c1cd072f5a"
SRC_URI[sha256sum] = "3ce8c773ba18525ce4dae3b01387da89c8e2e0e877635e8b3617a452994196e3"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
