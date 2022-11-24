# Copyright (C) 2014 Freescale Semiconductor
# Copyright 2017-2018, 2020, 2022 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Package group for Qt6 demos"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS:${PN}:append:imxgpu = " \
    cinematicexperience-rhi \
"

RDEPENDS:${PN}:remove:imxgpu = "cinematicexperience-rhi"

ALLOW_EMPTY:${PN} = "1"
