# Copyright 2019-2020 NXP

DESCRIPTION = "i.MX vc8000e encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

SRC_URI[md5sum] = "facc6abc8c484c61e8d7e4ae9cc2b46e"
SRC_URI[sha256sum] = "bf6a474b754ca7160772a85ce3034e85e51678466af3085f6978e15b88869bea"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
