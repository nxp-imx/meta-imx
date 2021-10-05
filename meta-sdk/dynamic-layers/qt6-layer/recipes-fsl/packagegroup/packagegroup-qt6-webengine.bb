# Copyright (C) 2015 Freescale Semiconductor
# Copyright 2017-2018, 2020-2021 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Package group for Qt6 webengine and examples"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS:${PN} += " \
    qtwebengine \
    qtwebengine-qmlplugins \
    qtwebengine-examples \
"
