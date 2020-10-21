# Copyright 2019-2020 NXP

DESCRIPTION = "i.MX vc8000e encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=e9e880185bda059c90c541d40ceca922"

SRC_URI[md5sum] = "aa84198cfa2f2f0a047d1d076356a357"
SRC_URI[sha256sum] = "a3b20d065aa29b934861ffbce741a4092347c61397e5bb0c0933e81d99e41994"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
