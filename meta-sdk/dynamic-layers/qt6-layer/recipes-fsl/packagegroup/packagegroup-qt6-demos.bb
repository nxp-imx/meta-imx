# Copyright (C) 2014 Freescale Semiconductor
# Copyright 2017-2018, 2020 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Package group for Qt6 demos"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS:${PN}:append = " \
    qtbase-examples \
    qtdeclarative-examples \
    quitindicators \
    qt6-demo-extrafiles \
"

# Install the following apps on SoC with GPU
RDEPENDS:${PN}:append:imxgpu = " \
    qt6ledscreen \
    quitbattery \
    qt6everywheredemo \ 
    qt6nmapcarousedemo \
    qt6nmapper \
"

RDEPENDS:${PN}:append:imxgpu3d = " \
    qt3d-examples \
"
