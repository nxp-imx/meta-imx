# Copyright (C) 2014 Freescale Semiconductor
# Copyright 2017-2018, 2020 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Package group for Qt5 demos"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS:${PN}:append = " \
    qtbase-examples \
    qtdeclarative-examples \
    quitindicators \
    qt5-demo-extrafiles \
"

# Install the following apps on SoC with GPU
RDEPENDS:${PN}:append:imxgpu = " \
    qt5ledscreen \
    quitbattery \
    qt5everywheredemo \ 
    qt5nmapcarousedemo \
    qt5nmapper \
    cinematicexperience-rhi \
"

RDEPENDS:${PN}:append:imxgpu3d = " \
    qt3d-examples \
"
