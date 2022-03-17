# Copyright 2019-2021 NXP

DESCRIPTION = "i.MX vc8000e encoder library for Kenrel 5.15"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=be5ff43682ed6c57dfcbeb97651c2829" 

SRC_URI[md5sum] = "beb4921025a6e1d84017d0c32a4c6ad7"
SRC_URI[sha256sum] = "5a1a8c2eae3a0289164723589bbc002c42b706cccb2d749ef2923bf27ea3c857"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
