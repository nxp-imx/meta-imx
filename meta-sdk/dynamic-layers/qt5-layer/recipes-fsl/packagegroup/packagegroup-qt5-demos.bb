# Copyright (C) 2014 Freescale Semiconductor
# Copyright 2017-2018 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Package group for Qt5 demos"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS_${PN}_append = " \
    qtbase-examples \
    qtdeclarative-examples \
    quitindicators \
    qt5-demo-extrafiles \
"

# Install the following apps on SoC with GPU
RDEPENDS_${PN}_append_imxgpu = " \
    qt5ledscreen \
    quitbattery \
    qt5everywheredemo \ 
    qt5nmapcarousedemo \
    qt5nmapper \
    cinematicexperience-rhi \
"

RDEPENDS_${PN}_append_imxgpu3d = " \
    qt3d-examples \
"
