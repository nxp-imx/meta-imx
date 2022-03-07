# Copyright 2019-2021 NXP

DESCRIPTION = "i.MX vc8000e encoder library for Kenrel 5.15"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=be5ff43682ed6c57dfcbeb97651c2829" 

SRC_URI[md5sum] = "17452fbd0990313c5cd98ccb00bbdd40"
SRC_URI[sha256sum] = "2aebdf9e56e2c5e2b738702346b249e2792f18d90a55841d4e2e77bf0155978b"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
