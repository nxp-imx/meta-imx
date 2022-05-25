# Copyright (C) 2014 Freescale Semiconductor
# Copyright 2017-2018, 2020 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Package group for Qt6 demos"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS:${PN}:append = " \
    qtbase-examples \
    qtdeclarative-examples \
"

RDEPENDS_${PN}:append:imxgpu = " \
    cinematicexperience-rhi \
"

RDEPENDS:${PN}:append:imxgpu3d = " \
    qt3d-examples \
"
