# Copyright 2019-2020 NXP

DESCRIPTION = "i.MX vc8000e encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

SRC_URI[md5sum] = "8e33bc10f078fb57c11aee082fd609f6"
SRC_URI[sha256sum] = "8399ce45a1db527beb18b0c1b842673b9239f5a28436b87cc396bb0ab4d7b65e"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
