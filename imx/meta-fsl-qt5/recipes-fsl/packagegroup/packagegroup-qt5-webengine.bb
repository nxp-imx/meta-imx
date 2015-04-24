# Copyright (C) 2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Package group for Qt5 webengine and examples"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS_${PN} += " \
    qtwebengine \
    qtwebengine-qmlplugins \
    qtquickcontrols-qmlplugins \
    qtwebengine-examples \
"
