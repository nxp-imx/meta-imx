# Copyright 2019-2020 NXP

DESCRIPTION = "i.MX vc8000e encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d"

SRC_URI[md5sum] = "68515ad043e4cc7d2572e92e7ad462ff"
SRC_URI[sha256sum] = "62f040eb3d28fe77d8c6b3aa6f536617bb807b66e7931a4db951422e161f9762"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
