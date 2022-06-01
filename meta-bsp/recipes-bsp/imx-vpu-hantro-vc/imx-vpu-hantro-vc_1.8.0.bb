# Copyright 2019-2022 NXP

DESCRIPTION = "i.MX VC8000E encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=be5ff43682ed6c57dfcbeb97651c2829" 

SRC_URI[md5sum] = "5572c2462687dfd607c14e869fdd13a3"
SRC_URI[sha256sum] = "0f877f9411bc6be002929b3c4ab3c8a6211001d9cec9c87f3c97707e1deca6da"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(mx8mp-nxp-bsp)"
