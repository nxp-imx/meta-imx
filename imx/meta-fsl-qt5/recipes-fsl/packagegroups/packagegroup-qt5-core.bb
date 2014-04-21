# Copyright (C) 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Package group for Qt5 core"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS_${PN} += " \
    qtbase \
    qtbase-fonts \
    qtbase-plugins \
"