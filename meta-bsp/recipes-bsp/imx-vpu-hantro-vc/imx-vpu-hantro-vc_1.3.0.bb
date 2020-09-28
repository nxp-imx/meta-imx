# Copyright 2019-2020 NXP

DESCRIPTION = "i.MX vc8000e encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=983e4c77621568488dd902b27e0c2143" 

SRC_URI[md5sum] = "eda044bf7336577ca973722dff8a4adb"
SRC_URI[sha256sum] = "7da7130e37ccb4f2ea5dfecfcc35ab8f86de87409c5e86fa0f05ff6e05bd202a"

inherit fsl-eula2-unpack2

COMPATIBLE_MACHINE = "(imx8mpevk)"
