# Copyright 2019-2021 NXP

DESCRIPTION = "i.MX vc8000e encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=e565271ec9a80ce47abbddc4bffe56fa"

SRC_URI[md5sum] = "fbd43a100c27abbae301428f1ae2bc64"
SRC_URI[sha256sum] = "e59ac2ded726d722f61793b17fc394ce87b1c5710cb79f0b1d60b87fca5829e1"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
