# Copyright (C) 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Package group for Qt5 webkit and examples"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS_${PN} += " \
    qtwebkit \
    qtwebkit-examples-examples \
"
