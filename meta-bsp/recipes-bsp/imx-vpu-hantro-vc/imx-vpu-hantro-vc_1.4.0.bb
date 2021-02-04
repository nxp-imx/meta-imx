# Copyright 2019-2021 NXP

DESCRIPTION = "i.MX vc8000e encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=cf3f9b8d09bc3926b1004ea71f7a248a"

SRC_URI[md5sum] = "1b15388883bd3c80beb0e5077f40c4e0"
SRC_URI[sha256sum] = "3587655a4aa42074a131778510cf64b01fab6076eae8103122cbf5440a75f427"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
