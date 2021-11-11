# Copyright 2019-2021 NXP

DESCRIPTION = "i.MX vc8000e encoder library for Kenrel 5.15"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=03bcadc8dc0a788f66ca9e2b89f56c6f" 

SRC_URI[md5sum] = "53c71aec20aab754357548833e073f24"
SRC_URI[sha256sum] = "b4366c5507b4692a61c479ce1b2ffc5826768769207fcfa4bc1b52058df4d7eb"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
