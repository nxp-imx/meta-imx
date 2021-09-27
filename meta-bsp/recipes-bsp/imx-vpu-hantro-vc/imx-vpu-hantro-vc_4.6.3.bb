# Copyright 2019-2021 NXP

DESCRIPTION = "i.MX vc8000e encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=28241cb895217d7946e40e7227136d02"

SRC_URI[md5sum] = "138a8eb5b3a306748a862fffae3d0fa3"
SRC_URI[sha256sum] = "96529d8da3f185d9e90d03ece81f45b1e521f388cf840df8f4fb43c1176125b8"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
