# Copyright 2019-2021 NXP

DESCRIPTION = "i.MX vc8000e encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=28241cb895217d7946e40e7227136d02"

SRC_URI[md5sum] = "2b18d6ebef0e2b1ef94d66d9cd56f6fa"
SRC_URI[sha256sum] = "ed85249a45f6c00eb92e46bcb36e553ff69a3b804ff010a86ba8f86cf06aed2a"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
