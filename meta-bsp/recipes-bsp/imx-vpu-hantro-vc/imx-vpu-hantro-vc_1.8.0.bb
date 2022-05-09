# Copyright 2019-2022 NXP

DESCRIPTION = "i.MX VC8000E encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=be5ff43682ed6c57dfcbeb97651c2829" 

SRC_URI[md5sum] = "a9f56332f0afcb5a6a5ef9597af20b84"
SRC_URI[sha256sum] = "cf98db29bee146f2017d1c108962d0f834e728293a3e7d032ee1a6eefd480418"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(mx8mp-nxp-bsp)"
