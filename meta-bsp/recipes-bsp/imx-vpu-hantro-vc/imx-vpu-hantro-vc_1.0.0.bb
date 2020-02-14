# Copyright 2019-2020 NXP

DESCRIPTION = "i.MX vc8000e encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

SRC_URI[md5sum] = "b1e7b34ea0788f9c8b488eeaa0679385"
SRC_URI[sha256sum] = "bf720ea733005ddd0d868f5e1790ad7407a28a6d3b78bb29d6a4b956bf8273d2"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
