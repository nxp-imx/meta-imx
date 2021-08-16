# Copyright (C) 2015 Freescale Semiconductor
# Copyright 2017-2018, 2020 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Package group for Qt5 webengine and examples"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS:${PN} += " \
    qtwebengine \
    qtwebengine-qmlplugins \
    qtquickcontrols-qmlplugins \
    qtwebengine-examples \
"
