# Copyright 2019-2021 NXP

DESCRIPTION = "i.MX vc8000e encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a"

SRC_URI[md5sum] = "37c61718602ff08041b81319cfd6a8d9"
SRC_URI[sha256sum] = "8425796fc63d7107f2f57c51497281c4d54c883b2670817347fbe55f39dc2b8c"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
