# Copyright 2019-2020 NXP

DESCRIPTION = "i.MX vc8000e encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

SRC_URI[md5sum] = "25baa7dea1414fba24bc62faa9e98fdf"
SRC_URI[sha256sum] = "72cd09ae5154c15342370ffc75d7dd36ce997f389d53f22daa4383af4f600a87"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
